package cn.sohu.jack.thinking.java.chapter13string;

import java.util.Arrays;

/**
 * @author jinxianbao
 * @date 2019/5/17 8:09 PM
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest..." +
            "with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    /**
     * @description: 
     * @param args 
     * @return: void
     * @author: Xiangbao Jin
     * @since: 2019/5/23 11:13 PM
     */
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}
