package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 3:11 PM
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/StoringAndRecoveringData.out")));
        out.writeDouble(3.1415926);
        out.writeUTF("This is a PI");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(
                "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/StoringAndRecoveringData.out")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

    }
}
