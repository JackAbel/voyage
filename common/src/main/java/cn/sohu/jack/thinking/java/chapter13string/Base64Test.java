package cn.sohu.jack.thinking.java.chapter13string;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @description: base64 encode and decode
 * @author: Xiangbao Jin
 * @since 2019/6/17 2:45 PM
 */
public class Base64Test {
    public static void main(String[] args) {
        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        final String text = "W$daz3tx";
        final byte[] textByte;
        try {
            textByte = text.getBytes("UTF-8");

            //编码
            final String encodedText = encoder.encodeToString(textByte);
            System.out.println(encodedText);
            //解码
            System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
