package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.Instrument;

/**
 * @author jinxianbao
 * @date 2019/3/19 10:24 PM
 */
public class Outer {
    private String s;

    private void oneMethod() {
        System.out.println("www");
    }

    public Outer(String s) {
        this.s = s;
    }
    class Inner {
        private int y = 12;
        public int yk = 12;
        public String toString() {
            oneMethod();
            s = "sg";
            return s;
        }
    }

    public void twoMethod() {

        Inner inner = new Inner();
        // 外围类不能直接访问内部类的私有变量，通过对象访问
        inner.y = 12;
        inner.toString();
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("we");
        Inner i = outer.getInner();
        System.out.println(i.toString());
        outer.twoMethod();
    }
}
