package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/8 8:47 AM
 */
public class Caller {
    private Incrementable callbackRefrence;
    Caller(Incrementable i) {
        this.callbackRefrence = i;
    }

    void go() {
        callbackRefrence.increment();
    }
}
