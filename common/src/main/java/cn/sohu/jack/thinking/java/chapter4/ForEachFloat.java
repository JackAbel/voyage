package cn.sohu.jack.thinking.java.chapter4;

import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/3/5 10:45 PM
 */
public class ForEachFloat {

    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x: f) {
            System.out.println(x);
        }
    }
}
