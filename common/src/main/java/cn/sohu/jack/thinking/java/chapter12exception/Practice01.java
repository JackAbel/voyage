package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/22 11:40 AM
 */
public class Practice01 {
    public static void main(String[] args) {
        String[] s = {"0"};
        try {
            int se = 12 / Integer.parseInt(s[0]);
            throw new Exception(s[0]);
        } catch (Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace();
        } finally {
            System.out.println("proving finally has been execute");
        }
    }
}
