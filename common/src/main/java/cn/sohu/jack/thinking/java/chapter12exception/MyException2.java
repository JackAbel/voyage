package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/23 9:55 AM
 */
public class MyException2 extends Exception {
    private int index = 0;

    public MyException2() {

    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int index) {
        super(msg);
        this.index = index;
    }

    public int val() {
        return index;
    }

    @Override
    public String getMessage() {
        return "Detail message: " + index + super.getMessage();
    }
}
