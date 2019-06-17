package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 5:11 PM
 */
class C implements A {
    public void f() {
        System.out.println("public method C.f()");
    }

    public void g() {
        System.out.println("public method C.g()");
    }

    void u() {
        System.out.println("package method C.u()");
    }

    protected void v() {
        System.out.println("protected method C.v()");
    }

    private void w() {
        System.out.println("private method C.w()");
    }
}
