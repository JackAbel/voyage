package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:23 AM
 */
public class UnjCycle extends Cycle {
    public static void main(String[] args) {
        UnjCycle unjCycle = new UnjCycle();
        unjCycle.ride(unjCycle);
    }
}
