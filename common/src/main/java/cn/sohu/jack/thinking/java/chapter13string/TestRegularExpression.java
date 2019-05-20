package cn.sohu.jack.thinking.java.chapter13string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jinxianbao
 * @date 2019/5/18 3:05 PM
 */
public class TestRegularExpression {
    private static void verifyRegex(String[] args) {
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("match \"" + m.group() + "\" at positions " + m.start() + "_" + (m.end()-1));
            }
        }
    }

    public static void main(String[] args) {
        verifyRegex(new String[]{"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"});
    }
}
