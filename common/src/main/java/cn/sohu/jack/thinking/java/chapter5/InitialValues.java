package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 4:38 PM
 */
public class InitialValues {
    boolean t;
    char c;
    int i;
    double d;
    float f;
    long l;
    InitialValues initialValues;

    void printInitialValues() {
        System.out.println("DataType      Initial Values");
        System.out.println("boolean       " + t);
        System.out.println("char          " + "[" + c + "]");
        System.out.println("int           " + i);
        System.out.println("double        " + d);
        System.out.println("float         " + f);
        System.out.println("long          " + l);
        System.out.println("InitialValues " + initialValues);
    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.printInitialValues();
    }
}
