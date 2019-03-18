package cn.sohu.jack.thinking.java.chapter9interface;

import cn.sohu.jack.thinking.java.chapter8polymorphism.Note;

/**
 * @author jinxianbao
 * @date 2019/3/15 10:01 PM
 */
public class Music4 {
    // Don't care about type; added to the systems can work right
    static void tune(AbstractInstrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }
    static void tuneAll(AbstractInstrument[] e) {
        for (AbstractInstrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        AbstractInstrument[] instruments = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(instruments);
    }
}
