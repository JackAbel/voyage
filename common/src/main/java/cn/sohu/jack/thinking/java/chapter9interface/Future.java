package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter10innerclass.SecondInner;
import cn.sohu.jack.thinking.java.chapter8polymorphism.OneMethod;

/**
 * @author jinxianbao
 * @date 2019/3/20 10:00 AM
 */
public class Future {
    protected class Inner2 implements OneMethod {
        public Inner2() {

        }
        public void like() {
            System.out.println("be");
        }
    }
}
