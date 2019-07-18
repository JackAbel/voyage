package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 6:06 PM
 */
public class Cup {
    static Bowl bowl2;// = new Bowl(2);
    static Bowl bowl3;// = new Bowl(3);
    static {
        bowl2 = new Bowl(2);
        bowl3 = new Bowl(3);
        System.out.println("--");
    }

    Cup() {
        System.out.println("Cup()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cup.bowl2.f1(99);
    }
}
