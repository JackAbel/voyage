package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 7:25 PM
 */
public class Exercise608 {
    public static void main(String[] args) {
        Connection c = ConnectionManager.getConnection();
        while (c != null) {
            System.out.println(c);
            c = ConnectionManager.getConnection();
        }
    }


}
