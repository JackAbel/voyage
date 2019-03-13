package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 7:05 PM
 */
public class ConnectionManager {

    private static Connection[] connections = new Connection[12];
    private static int counter = 0;
    static  {
        for (int i = 0; i < connections.length; i++) {
            connections[i] = Connection.makeConnection();
        }
    }

    public static Connection getConnection() {
        if (counter < connections.length) {
            return connections[counter++];
        }
        return null;
    }
}
