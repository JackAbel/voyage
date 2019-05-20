package cn.sohu.jack.thinking.java.chapter13string;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author jinxianbao
 * @date 2019/5/18 3:52 PM
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!is unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
