package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 7:03 PM
 */
public class Connection {
    private Connection() {

    }

    public static Connection makeConnection() {
        return new Connection();
    }
}
