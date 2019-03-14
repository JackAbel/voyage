package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:35 AM
 */
public class Shape {
    public void draw() {
        System.out.println("Shape.draw()");
    }
    public void erase() {
        draw();
        System.out.println("Shape.erase()");
    }
}
