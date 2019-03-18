package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter8polymorphism.Note;

/**
 * @author jinxianbao
 * @date 2019/3/15 9:46 PM
 */
public abstract class AbstractInstrument {
    private int i;
    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}
