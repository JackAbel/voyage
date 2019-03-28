package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 9:40 AM
 */
public class Tricycle implements Cycle {
    public String s;

    private Tricycle(String s) {
        this.s = s;
    }

    public void ride(String s) {
        System.out.println("Tricycle " + s);
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycles(String s) {
            return new Tricycle(s);
        }
    };
}
