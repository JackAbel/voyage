package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 9:20 PM
 */
public class EvenCheckerParatice11 implements Runnable {
    private DaemonsParactice11 generator;
    private final int id;

    public EvenCheckerParatice11(DaemonsParactice11 g, int ident) {
        this.generator = g;
        this.id = ident;

    }
    public void run() {
        while (!generator.getCanced()) {
            int val = generator.operateNext();
            if (val % 3 != 0) {
                System.out.println(val + " not even!");
                System.out.println("num1 is " + generator.getNum1());
                System.out.println("num2 is " + generator.getNum2());
                generator.setCanced();
            } else if (generator.getNum1() % 2 != 0){

                System.out.println("num1 is " + generator.getNum1());
                System.out.println("num2 is " + generator.getNum2());
                generator.setCanced();
            }
        }
    }

    public static void test(DaemonsParactice11 gp, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenCheckerParatice11(gp, i));
        }
        exec.shutdown();
    }

    public static void test(DaemonsParactice11 gp) {
        test(gp, 10);
    }
}
