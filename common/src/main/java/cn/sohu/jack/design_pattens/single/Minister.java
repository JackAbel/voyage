package cn.sohu.jack.design_pattens.single;

/**
 * @description: 臣子
 * @author: Xiangbao Jin
 * @since 2020/9/12 9:25 PM
 */
public class Minister {
    public static void main(String[] args) {
        Emperor emperor = Emperor.getInstance();
        for (int i = 0; i < 3; i++) {
            emperor.say();
        }
    }
}
