package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.Factories;

/**
 * @author jinxianbao
 * @date 2019/3/27 11:22 PM
 */
public class Implementation1 implements Service {
    private Implementation1() { }

    public void method1() {
        System.out.println("Implementation1 method1()");
    }

    public void method2() {
        System.out.println("Implementation1 method2()");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1() {
            };
        }
    };
}
