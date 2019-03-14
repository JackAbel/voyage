package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:45 AM
 */
public class Shapes {
    private static RandomShapeGenerator ge = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = ge.next();
        }
        for (Shape shape : s) {
            shape.draw();
        }
    }
}
