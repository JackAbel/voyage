package cn.sohu.jack.thinking.java.chapter13string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jinxianbao
 * @date 2019/5/18 3:05 PM
 */
public class Practice11 {
    private static void verifyRegex(String[] args, String s) {
        System.out.println("Input: \"" + args[0] + "\"");

        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(s);
            while (m.find()) {
                System.out.println("match \"" + m.group() + "\" at positions " + m.start() + "_" + (m.end()-1));
            }
        }
    }

    public static void main(String[] args) {
        verifyRegex(new String[]{"(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"},
                "Arline are eight apples and one orange while Anita hadn't any");
    }
}
