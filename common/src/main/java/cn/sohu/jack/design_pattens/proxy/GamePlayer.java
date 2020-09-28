package cn.sohu.jack.design_pattens.proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 4:29 PM
 */
public class GamePlayer implements IGamePlayer {

    public String name;
    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        System.out.println("登录用户是：" + name + ";用户密码是：" + password);
    }

    @Override
    public void killBoss() {
        System.out.println("kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println("升了一级");
    }
}
