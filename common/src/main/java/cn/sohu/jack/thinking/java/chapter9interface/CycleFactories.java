package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 9:47 AM
 */
public class CycleFactories {
    public static void cycleConsumer(CycleFactory cycle, String s) {
        Cycle c = cycle.getCycles(s);
        c.ride(s);
    }

    public static void main(String[] args) {
        cycleConsumer(Bicycle.factory, "bi");
        cycleConsumer(Tricycle.factory, "tr");
        cycleConsumer(Unicycle.factory, "un");
    }
}
