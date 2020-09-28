package cn.sohu.jack.design_pattens.factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 10:16 PM
 */
public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void getTalk() {
        System.out.println("亚洲话");
    }
}
