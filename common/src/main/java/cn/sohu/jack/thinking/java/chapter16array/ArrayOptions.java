package cn.sohu.jack.thinking.java.chapter16array;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/25 9:35 PM
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres; // local uninitialized variable
        BerylliumSphere[] berylliumSphere2 = new BerylliumSphere[5];
        for (int i = 0; i < berylliumSphere2.length; i++) {
            if (berylliumSphere2[i] == null) {
                berylliumSphere2[i] = new BerylliumSphere();
            }
        }
        System.out.println();
        berylliumSpheres = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
        practice1(berylliumSphere2);
        practice1(new BerylliumSphere[]{new BerylliumSphere()});
    }

    public static void practice1(BerylliumSphere[] b) {
        System.out.println(b.length);
    }
}
