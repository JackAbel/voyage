package cn.sohu.jack.thinking.java.chapter8polymorphism;

import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:42 AM
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(2)) {
            case 0: return new Circle();
            case 1:
            default:return new Triangle();
        }
    }
}
