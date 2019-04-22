package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/22 11:57 AM
 */
public class Practice2 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
