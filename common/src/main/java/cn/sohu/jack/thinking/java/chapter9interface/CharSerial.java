package cn.sohu.jack.thinking.java.chapter9interface;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jinxianbao
 * @date 2019/3/19 8:50 PM
 */
public class CharSerial implements Readable {
    private static Random random = new Random(48);
    private int count;
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public CharSerial(int count) {
        this.count = count;
    }
    public int read(CharBuffer charBuffer) {
        if (count-- == 0) {
            return -1;
        }
        for (int i = 0; i < 2; i++) {
            charBuffer.append(capitals[random.nextInt(capitals.length)]);
            charBuffer.append(lowers[random.nextInt(lowers.length)]);
        }
        charBuffer.append(" ");
        return 12;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new CharSerial(3));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
