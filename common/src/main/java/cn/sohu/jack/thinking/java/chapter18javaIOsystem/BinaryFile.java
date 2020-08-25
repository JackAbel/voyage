package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 3:57 PM
 */
public class BinaryFile {
    public static byte[] read(File file) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] data = new byte[bf.available()];
            bf.read();
            return data;
        } finally {
            bf.close();
        }
    }

    public static byte[] read(String file) throws IOException {
        return read(new File(file).getAbsoluteFile());
    }
}
