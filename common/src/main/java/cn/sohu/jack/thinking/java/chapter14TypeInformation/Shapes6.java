package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.util.Arrays;
import java.util.List;

/**
 * @description: practice
 * @author: XiangBaoJin
 * @Date
 */
public class Shapes6 {
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
        List<Shape6> shapes = Arrays.asList(new Circle6(), new Square6(), new Triangle6());
        for (Shape6 shape : shapes) {
            shape.flag =true;
            shape.draw();
            System.out.println(shape.toString());
        }
    }
}
