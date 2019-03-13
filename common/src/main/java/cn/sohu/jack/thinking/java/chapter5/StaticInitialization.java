package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 5:18 PM
 */
public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("Create new Cupboard() in main");
        new Cupboard();
        System.out.println("Create new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

}
