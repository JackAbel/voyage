package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 6:11 PM
 */
public class GenericCast {
    private static int size = 4;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<>(size);
        for (String s : "A,B,C,D" .split(",")) {
            strings.push(s);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(strings.pop());
        }
    }
}
