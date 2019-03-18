package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:23 AM
 */
public class UniCycle extends Cycle {

    public void balance() {
    }
    public static void main(String[] args) {
        UniCycle uniCycle = new UniCycle();
        uniCycle.ride(uniCycle);
    }
}
