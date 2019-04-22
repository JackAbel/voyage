package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/22 12:17 PM
 */
public class FourException extends Exception {
    public String s;

    public FourException(String s) {
        this.s = s;
    }

    public void getS() {
        System.out.println(s);
    }
}
