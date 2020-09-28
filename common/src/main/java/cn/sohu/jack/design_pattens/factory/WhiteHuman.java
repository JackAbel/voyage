package cn.sohu.jack.design_pattens.factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 10:16 PM
 */
public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void getTalk() {
        System.out.println("欧美话");
    }
}
