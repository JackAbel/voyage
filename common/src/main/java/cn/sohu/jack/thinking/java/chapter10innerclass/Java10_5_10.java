package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.Future;

/**
 * @author jinxianbao
 * @date 2019/3/20 10:02 AM
 */
public class Java10_5_10 extends Future {

    public Destination testOne(boolean isIn) {
        while (isIn) {
            class OneTest implements Destination {
                public String readLable() {
                    return "sg";
                }
            }
            return new OneTest();
        }
        return null;
    }
}
