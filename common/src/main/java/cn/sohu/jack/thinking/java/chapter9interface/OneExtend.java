package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 9:43 AM
 */
public class OneExtend extends AbstractOne {
    public void print() {
        //oneAbstract = new OneExtend();
        System.out.println("we are worker");
    }

    public void print2() {
        System.out.println("OneExtend.print2()");
    }
}
