package cn.sohu.jack.design_pattens.proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 4:56 PM
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("做了某事---------！" + str);
    }
}
