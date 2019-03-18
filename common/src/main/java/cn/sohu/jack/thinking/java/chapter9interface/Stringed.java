package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter8polymorphism.Note;

/**
 * @author jinxianbao
 * @date 2019/3/15 9:50 PM
 */
public class Stringed extends AbstractInstrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play(Note)" + note);
    }
    @Override
    public String what() {
        return "stringed";
    }

    public void adjust() {

    }
}
