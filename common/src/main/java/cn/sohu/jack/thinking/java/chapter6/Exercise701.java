package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 8:09 PM
 */
public class Exercise701 {
    private Connection connection;

    public String toString() {
        if (connection == null) {
            connection = Connection.makeConnection();
        }
        return "sg" + connection;
    }

    public static void main(String[] args) {
        Exercise701 exercise701 = new Exercise701();
        System.out.println(exercise701.toString());
    }
}
