package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description: test
 * @author: Xiangbao Jin
 * @since 2019/5/26 9:01 PM
 */
public class ToyTest {
    public static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("cn.sohu.jack.thinking.java.chapter14TypeInformation.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for (Class c2 : c.getInterfaces()) {
            printInfo(c2);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());

    }
}
