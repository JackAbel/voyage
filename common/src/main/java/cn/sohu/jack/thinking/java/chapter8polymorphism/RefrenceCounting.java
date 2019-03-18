package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 10:18 PM
 */
public class RefrenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared),new Composing(shared),new Composing(shared),
                new Composing(shared)};
        for (Composing c : composings) {
            System.out.println(c.shared.getRefCount());
            c.dispose();
        }
    }
}
