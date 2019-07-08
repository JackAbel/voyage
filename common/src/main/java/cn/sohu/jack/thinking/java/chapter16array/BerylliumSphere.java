package cn.sohu.jack.thinking.java.chapter16array;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/25 9:28 PM
 */
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere" + id;
    }
}
