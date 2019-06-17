package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description: learn dynamic proxy
 * @author: Xiangbao Jin
 * @since 2019/6/14 4:02 PM
 */
public class UserManagerImpl implements UserManager {
    public void addUser(String userId, String userName) {
        System.out.println("userId is " + userId + "; userName is " + userName);
    }
}
