package cn.sohu.jack.design_pattens.single;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 9:21 PM
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance() {
        return emperor;
    }

    public  void say() {
        System.out.println("我是皇帝某某");
    }
}
