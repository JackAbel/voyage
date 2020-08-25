package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: task wait and notifyAll
 * @author: Xiangbao Jin
 * @since 2019/8/28 10:51 AM
 */
public class Car {
    private boolean waxOn = false;

    public synchronized void setWaxOn() {
        waxOn = true; // Read to buff
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false; // Ready for another coat of wax
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException{
        while (!waxOn) {
            wait();
        }
    }

    public synchronized void waitForBuffed() throws InterruptedException {
        while (waxOn) {
            wait();
        }
    }
}
