package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 9:16 PM
 */
public class Outer {
    class sout {
        class sg {
            private int ch = 9;
        }
    }
    static class Inner {
        private int i = 0;
        private static int y = 2;
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.i);
    }
}
