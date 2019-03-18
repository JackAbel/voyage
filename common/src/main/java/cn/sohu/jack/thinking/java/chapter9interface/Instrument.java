package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter8polymorphism.Note;

/**
 * @author jinxianbao
 * @date 2019/3/18 10:16 AM
 */
public interface Instrument {
    int value = 5; // It's static and final
    void play(Note note); // Automatically public
    void adjust();
}
