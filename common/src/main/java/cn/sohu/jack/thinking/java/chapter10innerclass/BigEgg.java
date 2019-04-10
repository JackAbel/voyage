package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 11:11 AM
 */
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
