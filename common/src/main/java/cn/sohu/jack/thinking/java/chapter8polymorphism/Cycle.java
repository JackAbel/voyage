package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:21 AM
 */
public class Cycle {

    public void ride(Cycle cycle) {
        System.out.println("ride(Cycle)" + cycle.getClass());
    }
}
