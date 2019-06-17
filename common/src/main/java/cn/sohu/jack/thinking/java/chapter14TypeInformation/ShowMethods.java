package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/10 10:00 AM
 */
class ShowMethods {
    public static String usage =
            "usage: \n" +
                    "ShowMethods qualified class.name \n" +
                    "to show all methods in class or \n" +
                    "ShowMethods qualified class.name word \n" +
                    "to search for methods in involving word";
    public static Pattern p2 = Pattern.compile("\\w+\\.");
    public static Pattern p = Pattern.compile("(\\w+\\.)|\\s*final|\\s*native");


    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines  = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method s : methods) {
                    System.out.println(p.matcher(s.toString()).replaceAll(""));
                }
                for (Constructor ctor : ctors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            } else {
                for (Method m : methods) {
                    if (m.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(methods.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for (Constructor ctor : ctors) {
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
