package cn.sohu.jack.thinking.java.chapter2;

public class NewBasicType {

    public static int anInt;
    public static char anChar;

    public static void main(String[] args) {

        //NewBasicType newBasicTypes = new NewBasicType();
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 47;
        dataOnly.b = false;
        dataOnly.d = 12.5;

        System.out.println("init:" + anInt + "__" + anChar);
    }
}
