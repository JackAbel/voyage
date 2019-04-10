package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 11:08 AM
 */
public class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk");
        }
    }

    public Egg() {
        System.out.println("new egg");
        y = new Yolk();
    }
}
