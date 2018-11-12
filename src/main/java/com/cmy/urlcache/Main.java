package com.cmy.urlcache;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by cmy on 2017/10/12
 */
public class Main {

    private static final char[] HEX_CHAR_ARRAY = "0123456789abcdef".toCharArray();
    private static final char[] SHA_256_CHARS = new char[64];

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String str = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504806550051&di=647a5b985f95a7dbb4f855ee2ac58b17&imgtype=0&src=http%3A%2F%2Fwww.fansimg.com%2Fuploads2012%2F06%2Fuserid356895time20120612023409.jpg";

        long t1 = System.currentTimeMillis();
        String md5 = md5(str);
        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);
        System.out.println(md5);
    }

    private static String md5(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        bytes = messageDigest.digest(bytes);
        return bytesToHex(bytes, SHA_256_CHARS);
    }

    private static String bytesToHex(byte[] bytes, char[] hexChars) {
        int v;
        for (int j = 0; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_CHAR_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_CHAR_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

}
