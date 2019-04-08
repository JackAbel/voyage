package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/2 9:34 AM
 */
public class B {
    private int num;

    public B(int num) {
        this.num = num;
    }
    U[] UArray = new U[num];

    public void SaveArray(U sg) {
        for (int i = 0; i < UArray.length; i++) {
            UArray[i] = sg;
        }
    }

    public void SaveNull() {
        for (int i = 0; i < UArray.length; i++) {
            UArray[i] = null;
        }
    }

    public void TraverseUArray() {
        for (U u : UArray) {
            u.getId();
            u.skip();
            u.user();
        }
    }

    public static void main(String[] args) {
        A ae = new A();
        B be = new B(12);
        be.SaveArray(ae.CreateU());
        be.TraverseUArray();
        be.SaveNull();
    }
}
