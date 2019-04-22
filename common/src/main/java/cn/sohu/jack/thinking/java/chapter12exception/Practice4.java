package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/22 2:23 PM
 */
public class Practice4 {
    public static void main(String[] args) {
        try {
            String s = "t1";
            throw new FourException(s);
        } catch (FourException e) {
            e.printStackTrace();
        }
    }
}
