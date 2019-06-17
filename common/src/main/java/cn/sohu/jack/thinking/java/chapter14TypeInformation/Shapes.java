package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.util.Arrays;
import java.util.List;

/**
 * @description: practice
 * @author: XiangBaoJin
 * @Date
 */
public class Shapes {
    public static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            return;
        } else {
            System.out.println("rotate " + shape.toString());
        }

    }
    /**
     * @description: 
     * @param args 
     * @return: void
     * @author: Xiangbao Jin
     * @since: 2019/5/26 9:01 PM
     */

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapes) {
            shape.draw();
        }
        Rhomboid rhomboid = new Rhomboid();
        ((Shape)rhomboid).draw();
        Shape s = (Shape)rhomboid;

        if (s instanceof Circle) {
            ((Circle)s).draw();
        } else if (!(s instanceof Circle)) {
            System.out.println("(Shape)rhomboid is not Circle type");
        }

        // Inconvertible type
        // ((Circle)rhomboid).draw();
    }
}
