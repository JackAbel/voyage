package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/15 9:36 AM
 */
public class WheatMill extends Mill {
    // prove CovariantReturn
    @Override
    Wheat process() {
        return new Wheat();
    }
}
