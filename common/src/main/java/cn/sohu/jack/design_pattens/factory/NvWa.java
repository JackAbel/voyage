package cn.sohu.jack.design_pattens.factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 10:25 PM
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory<Human> humanFactory = new HumanFactory<>();
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        yellowHuman.getColor();
        yellowHuman.getTalk();
        whiteHuman.getColor();
        whiteHuman.getTalk();
    }
}
