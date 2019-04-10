package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 10:51 AM
 */
public class WithInner {
    class Inner {}

    class Inner2 {
        public Inner2(String s) {
            System.out.println(s);
        }
    }
}
