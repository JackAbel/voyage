package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/27 11:22 PM
 */
public class Implementation2 implements Service {
    private Implementation2() { }

    public void method1() {
        System.out.println("Implementation2 method1()");
    }

    public void method2() {
        System.out.println("Implementation2 method2()");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2() {
            };
        }
    };
}
