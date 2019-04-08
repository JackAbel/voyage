package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/2 9:31 AM
 */
public class A {
    public U CreateU() {
        return new U() {
            @Override
            public int getId() {
                return 0;
            }

            @Override
            public void skip() {

            }

            @Override
            public String user() {
                return null;
            }
        };
    }
}
