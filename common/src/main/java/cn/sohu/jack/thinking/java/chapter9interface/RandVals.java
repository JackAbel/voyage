package cn.sohu.jack.thinking.java.chapter9interface;

import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/3/19 9:36 PM
 */
public interface RandVals {
    Random RANDOM = new Random(47);
    int RANDOM_INT = RANDOM.nextInt(10);
    long RANDOM_LONG = RANDOM.nextLong() * 10;
    float RANDOM_FLOAT = RANDOM.nextFloat() * 10;
    double RANDOM_DOUBLE = RANDOM.nextDouble() * 10;
}
