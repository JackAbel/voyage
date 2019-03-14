package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:12 AM
 */
public class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
}
