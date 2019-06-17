package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description: learn daynamic proxy
 * @author: Xiangbao Jin
 * @since 2019/6/14 4:26 PM
 */
public class Client {

    public static void main(String[] args) {
        LogHander logHander = new LogHander();
        UserManager userManager = (UserManager)logHander.newProxyInstance(new UserManagerImpl());
        userManager.addUser("0","Jack");
    }
}
