package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 4:01 PM
 */
public class Exercise20<T extends LoveAndHate> {
    public void self(T s){
        s.hate();
        s.love();
    }

    public static void main(String[] args) {
        ThreeMethods s = new ThreeMethods();
        Exercise20<ThreeMethods> s2 = new Exercise20<>();
        s2.self(s);
    }
}
