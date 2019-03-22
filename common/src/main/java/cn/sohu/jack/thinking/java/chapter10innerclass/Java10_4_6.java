package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter8polymorphism.OneMethod;
import cn.sohu.jack.thinking.java.chapter9interface.Future;

/**
 * @author jinxianbao
 * @date 2019/3/20 10:02 AM
 */
public class Java10_4_6 extends Future {

    public OneMethod testOne() {
        Future future = new Future();
        // protect内部类的构造器要声明为 public 才能在外部访问
        Future.Inner2 futureInner = future.new Inner2();
        return futureInner;
    }
}
