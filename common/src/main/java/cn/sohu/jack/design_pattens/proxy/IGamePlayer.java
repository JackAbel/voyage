package cn.sohu.jack.design_pattens.proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 4:27 PM
 */
public interface IGamePlayer {
    void login(String name, String password);
    void killBoss();
    void upgrade();
}
