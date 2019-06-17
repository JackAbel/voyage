package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import cn.sohu.jack.thinking.java.chapter14TypeInformation.ShowMethods;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/10 10:31 AM
 */
public class Test {
    public static void main(String[] args) {
        String[] s = {"cn.sohu.jack.thinking.java.chapter14TypeInformation.ShowMethods"};
        String s2 = " a b c d";
        System.out.println(s2.lastIndexOf(" "));
        System.out.println(s2.substring(s2.lastIndexOf(" ")+1));
        //ShowMethods.main(s);
    }
}
