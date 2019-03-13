package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/13 9:25 PM
 * 空白常量构造器中初始化 以及 常量参数
 */
public class Poppet {
    private int i;
    private final Value value;

    public Poppet(int i) {
        this.i = i;
        value = new Value(i);
    }

    public Poppet(int i, String j) {
        this.i = i;
        value = new Value(i);
    }

    void with(final Value v1) {
        // can read args of final
        System.out.println(v1.i);
        // v1 = new Value(12); illegal
    }

    public static void main(String[] args) {
        Poppet poppet = new Poppet(12);
        System.out.println("poppet.value.i = " + poppet.value.i);
        // !poppet.value = new Value(15) final value don't change after initialize
        poppet = new Poppet(11);
        poppet.with(new Value(122));

        System.out.println("poppet.value.i = " + poppet.value.i);
    }

}
