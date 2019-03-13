package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 5:24 PM
 */
public class Table {
    static Bowl bowl = new Bowl(1);

    Table() {
        System.out.println("Table()");

    }
    void f2(int marker) {
        System.out.println("f2(" + marker +")");
    }
    static Bowl bowl2 = new Bowl(2);
}
