package cn.sohu.jack.design_pattens.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 4:45 PM
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");
        InvocationHandler handler = new GamePlayerIH(player);
        System.out.println("start-------");
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login(((GamePlayer) player).name, "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("end----------");
    }
}
