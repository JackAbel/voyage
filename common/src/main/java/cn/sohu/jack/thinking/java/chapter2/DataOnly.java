package cn.sohu.jack.thinking.java.chapter2;

public class DataOnly {

    int i;
    boolean b;
    double d;

    public static void main(String[] args) {

        NewBasicType newBasicType = new NewBasicType();
        NewBasicType newBasicType2 = new NewBasicType();
        NewBasicType newBasicType3 = new NewBasicType();

        System.out.println("static anInt init is:" + newBasicType.anInt);
        System.out.println("static anInt init is 2: " + newBasicType2.anInt);
        System.out.println("no static anInt2 init is:" + newBasicType.anInt2);
        System.out.println("no static anInt2 init is:" + newBasicType2.anInt2);

        newBasicType.incrent();
        newBasicType2.incrent();
        // newBasicType.incrent2();
        newBasicType2.incrent2();
        System.out.println("-----------------------------");
        // The static value out is same, 静态域只存在一个实例！
        System.out.println("static anInt init is:" + newBasicType.anInt);
        System.out.println("static anInt init is 2: " + newBasicType2.anInt);

        System.out.println("no static anInt2 init is:" + newBasicType.anInt2);
        System.out.println("no static anInt2 init is:" + newBasicType2.anInt2);


    }

}
