import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by cmy on 2018/11/12
 */
public class Test21 {

    private static int fileSize = 0;

    public static void main(String[] args) throws Exception {
        String path = "/Users/cmeiyuan/AndroidStudioProjects/rent/app/src/main/java";
        String target = "/Users/cmeiyuan/Desktop/src.txt";
        copyDir(new File(path), new File(target));
        System.out.println("文件数量:" + fileSize);
    }

    private static void copyDir(File dir, File to) throws Exception {
        System.out.println("copy dir:" + dir.getName());
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    copyDir(file, to);
                } else {
                    copyFile(file, to);
                }
            }
        }
    }

    public static void copyFile(File from, File to) throws Exception {
        // System.out.println("copy file:" + from.getName());
        fileSize++;
        InputStream inputStream = new FileInputStream(from);
        FileOutputStream fileOutputStream = new FileOutputStream(to, true);
        byte[] b = new byte[1024];
        int len;
        while ((len = inputStream.read(b)) != -1) {
            fileOutputStream.write(b, 0, len);
        }
        inputStream.close();
        fileOutputStream.close();
    }

}
