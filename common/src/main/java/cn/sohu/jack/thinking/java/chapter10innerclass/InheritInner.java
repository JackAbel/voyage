package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 10:52 AM
 */
public class InheritInner extends WithInner.Inner {
    //! InheritInner() {} won't compile
    InheritInner(WithInner withInner) {
        withInner.super();
    }

    static class InheritInn extends WithInner.Inner2 {
        InheritInn(WithInner withInner) {
            withInner.super("sg");
        }
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        InheritInn i2 = new InheritInn(wi);
    }

}
