import com.sun.deploy.xml.XMLNode;
import com.sun.deploy.xml.XMLParser;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by cmy on 2017/10/26
 */
public class Test {
    public static void main(String[] args) {

        String returnXml = "<xml>\n" +
                "<ToUserName><![CDATA[%s]]></ToUserName>\n" +
                "<FromUserName><![CDATA[%s]]></FromUserName>\n" +
                "<CreateTime>%s</CreateTime>\n" +
                "<MsgType><![CDATA[text]]></MsgType>\n" +
                "<Content><![CDATA[%s]]></Content>\n" +
                "</xml>";

        String xml = "<xml><ToUserName><![CDATA[gh_d090f2967137]]></ToUserName>\n" +
                "<FromUserName><![CDATA[otB_EwYjjSrvpjwDt7yAqGkLdPR4]]></FromUserName>\n" +
                "<CreateTime>1510666446</CreateTime>\n" +
                "<MsgType><![CDATA[text]]></MsgType>\n" +
                "<Content><![CDATA[张三丰]]></Content>\n" +
                "<MsgId>6488262981205918201</MsgId>\n" +
                "</xml>";

        XMLParser xmlParser = new XMLParser(xml);
        try {
            XMLNode xmlNode = xmlParser.parse();
            XMLNode ToUserNameXmlNode = xmlNode.getNested();
            XMLNode FromUserNameXmlNode = ToUserNameXmlNode.getNext();
            XMLNode CreateTimeXmlNode = FromUserNameXmlNode.getNext();
            XMLNode MsgTypeXmlNode = CreateTimeXmlNode.getNext();
            XMLNode ContentXmlNode = MsgTypeXmlNode.getNext();
            XMLNode MsgIdXmlNode = ContentXmlNode.getNext();

            String ToUserName = ToUserNameXmlNode.getNested().getName();
            String FromUserName = FromUserNameXmlNode.getNested().getName();
            String CreateTime = CreateTimeXmlNode.getNested().getName();
            String MsgType = MsgTypeXmlNode.getNested().getName();
            String Content = ContentXmlNode.getNested().getName();
            String MsgId = MsgIdXmlNode.getNested().getName();

            System.out.println(ToUserName);
            System.out.println(FromUserName);
            System.out.println(CreateTime);
            System.out.println(MsgType);
            System.out.println(Content);
            System.out.println(MsgId);

            String msg = String.format(returnXml, FromUserName, ToUserName, String.valueOf(System.currentTimeMillis() / 1000), "测试回复消息");

            System.out.println(msg);

        } catch (SAXException e) {
            e.printStackTrace();
        }


    }
}
