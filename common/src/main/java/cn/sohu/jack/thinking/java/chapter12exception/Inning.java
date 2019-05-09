package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/9 9:36 AM
 */
public abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {

    }

    public void questionableCall() throws BaseballException {

    }
    public abstract void atBat() throws Strike, Foul;

    public void walk() {

    }
}
