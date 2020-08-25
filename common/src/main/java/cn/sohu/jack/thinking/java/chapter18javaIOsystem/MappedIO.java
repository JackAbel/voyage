package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: fileChannel map is fastest "r", "rw", "rws", or "rwd"
 * @author: Xiangbao Jin
 * @since 2019/7/30 3:51 PM
 */
public class MappedIO {
    private static int numOfInts = 4000000;
    private static int numOfUbuffInts = 200000;
    private static String  fileName = "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/Temp.tmp";

    private abstract static class Tester {
        private String name;

        public Tester(String name) {
            this.name = name;
        }

        public void runTest() throws IOException{
            System.out.println(name + ": ");
            long start = System.nanoTime();
            test();
            double duration = System.nanoTime() - start;
            System.out.format("%.2f\n", duration/1.0e9);
        }
        public abstract void test() throws IOException;
    }
    private static Tester[] tests = {
            new Tester("Stream write") {
                @Override
                public void test() throws IOException {
                    DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
                    for (int i = 0; i < numOfInts; i++) {
                        dos.writeInt(i);
                    }
                    dos.close();
                }
            },
            new Tester("Mapped write") {
                @Override
                public void test() throws IOException {
                    FileChannel dos = new RandomAccessFile(fileName, "rw").getChannel();
                    IntBuffer ib = dos.map(FileChannel.MapMode.READ_WRITE, 0, dos.size()).asIntBuffer();
                    for (int i = 0; i < numOfInts; i++) {
                        ib.put(i);
                    }
                    dos.close();
                }
            },
            new Tester("Stream Read") {
                @Override
                public void test() throws IOException {
                    DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
                    for (int i = 0; i < numOfInts; i++) {
                        dos.readInt();
                    }
                    dos.close();
                }
            },
            new Tester("Mapped Read") {
                @Override
                public void test() throws IOException {
                    FileChannel dos = new FileInputStream(new File(fileName)).getChannel();
                    IntBuffer ib = dos.map(FileChannel.MapMode.READ_ONLY, 0, dos.size()).asIntBuffer();
                    while (ib.hasRemaining()) {
                        ib.get();
                    }
                    dos.close();
                }
            },
            new Tester("Stream write/read") {
                @Override
                public void test() throws IOException {
                    RandomAccessFile raf = new RandomAccessFile(new File(fileName), "rw");
                    raf.writeInt(1);

                    for (int i = 0; i < numOfUbuffInts; i++) {
                        raf.seek(raf.length() - 4);
                        raf.writeInt(raf.readInt());
                    }
                    raf.close();
                }
            },
            new Tester("Mapped Write/Read") {
                @Override
                public void test() throws IOException {
                    FileChannel dos = new RandomAccessFile(new File(fileName), "rw").getChannel();
                    IntBuffer ib = dos.map(FileChannel.MapMode.READ_WRITE, 0, dos.size()).asIntBuffer();
                    ib.put(0);
                    for (int i = 1; i < numOfUbuffInts; i++) {
                        ib.put(ib.get(i - 1));
                    }
                    dos.close();
                }
            }
    };

    public static void main(String[] args) throws IOException {
        for (Tester test : tests) {
            test.runTest();
        }
    }
}
