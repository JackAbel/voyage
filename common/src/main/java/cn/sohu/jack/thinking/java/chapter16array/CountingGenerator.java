package cn.sohu.jack.thinking.java.chapter16array;

import cn.sohu.jack.thinking.java.chapter15generics.Generator;
import sun.dc.pr.PRError;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/1 9:57 AM
 */
public class CountingGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;

        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }

    public static class Double implements Generator<java.lang.Double> {
        private double value = 0.0;

        public java.lang.Double next() {
            value += 1.0;
            return value;
        }

    }

    static char[] chars = ("abcdefg" + "ABCDEFG").toCharArray();
    public static class Character implements Generator<java.lang.Character> {
        private int index = -1;

        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }

    public static class String implements Generator<java.lang.String> {
        private int length = 7;
        Generator<java.lang.Character> ge = new Character();

        public String() {
        }

        public String(int length) {
            this.length = length;
        }

        public java.lang.String next() {
            char[] buf = new char[length];
            for (int i = 0; i < length; i++) {
                buf[i] = ge.next();
            }
            return new java.lang.String(buf);
        }
    }
}
