package cn.sohu.jack.thinking.java.chapeter20annotation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 11:40 AM
 */
public class Testable {
    public void execute() {
        System.out.println("executing ");
    }

    @test
    void testExecute() {
        execute();
    }
}
