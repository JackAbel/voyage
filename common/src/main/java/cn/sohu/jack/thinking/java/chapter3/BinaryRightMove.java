package cn.sohu.jack.thinking.java.chapter3;

public class BinaryRightMove {
    static int i = 0x42;
    static int j = 0x1f;

    public static void main(String[] args) {
        while (i != 0) {
            System.out.println("i.binary is " + Integer.toBinaryString(i));
            i >>>= 1;
        }
        j <<= 5;
        while (j != 0){
            System.out.println("j.binary is " + Integer.toBinaryString(j));
            j >>= 1;
        }

        String s = genericMethod('z', "Str");
        System.out.println(s);
        char c = 'a';
        String bit = Integer.toBinaryString(c);
        System.out.println("c.binary is " + bit);
        int i2 = i > j ? i : j; //三元选择操作符
    }

    private static <T> T genericMethod(char k, T t) {
        return t;
    }
}
