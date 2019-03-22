package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/20 9:23 AM
 */
public class DotNew {
    public class Inner {

    }
    SecondInner secondInner = new SecondInner();
    SecondInner.Inner si = secondInner.new Inner();
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner di = dn.new Inner();
    }
}
