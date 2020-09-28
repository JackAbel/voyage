package cn.sohu.jack.test;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/3 9:49 AM
 */
public class HelloServiceProxy implements HelloService {

    private HelloService target;

    public HelloServiceProxy(HelloService target) {
        this.target = target;
    }
    public void say() {
        System.out.println("start");
        target.say();
        System.out.println("end");
    }
}
