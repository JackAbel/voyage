package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 6:43 PM
 */
public class Practice14 {
    private static String s1 = "string";
    private static String s2;
    static {
        s2 = "r4";
    }

    private static void printStaticStr() {
        System.out.println("static chunk initialized " + s2);
    }

    public static void main(String[] args) {
        //Practice14 practice14 = new Practice14();
        Practice14.printStaticStr();
    }
}
