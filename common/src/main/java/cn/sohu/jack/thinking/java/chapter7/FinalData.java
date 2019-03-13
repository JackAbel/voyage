package cn.sohu.jack.thinking.java.chapter7;

import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/3/13 8:50 PM
 */
public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    // can be compile-time constants
    private final int valueOne = 9;
    private final static int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants
    private final int i4 = random.nextInt(12);
    static final int INT_5 = random.nextInt(12);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ";\n      INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData("live");
        // !finalData.valueOne++; Error: can't change value
        finalData.v2.i++; // Object is not constant;
        finalData.v1 = new Value(9);
        for (int i = 0; i < finalData.a.length; i++) {
            finalData.a[i]++; // Object isn't constant
        }
        // !finalData.v2 = new Value(9);
        // finalData.a = new  int[3]; don't change reference
        System.out.println(finalData);
        System.out.println("Create a new FinalData");
        FinalData fd1 = new FinalData("fd1");
        System.out.println(finalData);
        System.out.println(fd1);
    }
}
