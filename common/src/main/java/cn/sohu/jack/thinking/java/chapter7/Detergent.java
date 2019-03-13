package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 8:33 PM
 */
public class Detergent extends Cleanser {
    // change a method
    @Override
    public void scrub() {
        append(" Detergent.scrub() ");
        super.scrub();
        //scrub(); 递归
    }

    protected void apply(char c) {
        System.out.println("we have two " + c);
    }

    // Add methods to the interface;
    public void foam() {
        append(" foam() ");
    }

    /*public void finalMethodTest() {

    }*/
    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        detergent.append("aaaaaa");
        System.out.println(detergent);
        Cleanser.main(args);
        detergent.apply('s');
        detergent.apply();
        detergent.apply(4);
        detergent.apply("sg");
        System.out.println(detergent.toString());
    }

}
