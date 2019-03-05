package cn.sohu.jack.thinking.java.chapter2;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxTest {

    // 自动包装器对基本类型和包装器类型自动包装
    char c = 'x';
    Character ch = new Character(c);
    Character ch2 = 'x';
    // 反向调用包装器类
    char c2 = ch2;
    public static void main(String[] args) {
        List<Integer>  baseList = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            baseList.add(i);
            System.out.println(baseList.get(i-1));
        }
    }
}
