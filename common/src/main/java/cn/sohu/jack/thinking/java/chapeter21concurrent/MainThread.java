package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: 驱动线程的运行
 * @author: Xiangbao Jin
 * @since 2019/8/4 5:52 PM
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
