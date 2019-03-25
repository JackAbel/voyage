package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.Future;

/**
 * @author jinxianbao
 * @date 2019/3/20 10:02 AM
 */
public class Java10_5_11 {

    private class TwoTest implements Destination {
        public String readLable() {
            return "love";
        }
    }

    public Destination testOne(boolean isIn) {

        if (isIn) {
            return new TwoTest();
        }
        return null;
    }

    TwoTest testOne2() {
        return new TwoTest();
    }

    public static void main(String[] args) {
        Java10_5_11 s = new Java10_5_11();
        TwoTest ss = (TwoTest) s.testOne(true);
        TwoTest s2 = s.testOne2();

    }
}
