package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:36 AM
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    /*@Override
    public void erase() {
        System.out.println("Circle.erase()");
    }*/
    public static void main(String[] args) {
        // 调用的方法也会覆盖
        Circle circle = new Circle();
        circle.erase();
    }
}
