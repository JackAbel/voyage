package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter8polymorphism.Note;

/**
 * @author jinxianbao
 * @date 2019/3/15 9:50 PM
 */
public class Brass extends Wind{
    @Override
    public void play(Note note) {
        System.out.println("Brass.play(Note)" + note);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}
