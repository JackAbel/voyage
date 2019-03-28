package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 9:40 AM
 */
public class Bicycle implements Cycle {
    public String s;

    private Bicycle(String s) {
        this.s = s;
    }

    public void ride(String s) {
        System.out.println("Bicycle " + s);
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycles(String s) {
            return new Bicycle(s);
        }
    };
}
