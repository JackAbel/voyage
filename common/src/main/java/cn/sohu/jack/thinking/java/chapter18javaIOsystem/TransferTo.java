package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/29 10:08 PM
 */
public class TransferTo {
    public static void main(String[] args) throws IOException {
        FileChannel in = new FileInputStream(args[0]).getChannel();
        FileChannel out = new FileOutputStream(args[1]).getChannel();
        in.transferTo(0,in.size(),out);
        out.transferFrom(in,0,in.size());
    }
}
