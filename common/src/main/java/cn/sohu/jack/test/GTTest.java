package cn.sohu.jack.test;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/3 5:28 PM
 */
public class GTTest {
    public static void main(String[] args) {

        HelloService helloService = new HelloServiceImp();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(helloService);
        HelloService proxy = (HelloService) myInvocationHandler.getProxy();
        proxy.say();
        System.exit(0);
        GT<Integer> gt1 = new GT<>();
        gt1.var = 1;
        GT<String> gt2 = new GT<>();
        gt2.var = 2;
        System.out.println(gt1.var);

    }
}
