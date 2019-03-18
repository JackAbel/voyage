package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/15 9:23 AM
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }
    public void draw() {
        System.out.println("RoundGlyph.draw().radius " + radius);
    }

    public static void main(String[] args) {
        new RoundGlyph(12);
    }
}
