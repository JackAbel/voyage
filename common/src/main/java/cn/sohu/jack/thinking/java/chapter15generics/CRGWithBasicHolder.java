package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 7:46 PM
 */
public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.setElement(st2);
        Subtype st3 = st1.getElement();
        st1.f();
    }
}
