package cn.sohu.jack.thinking.java.chapter11collection;

/**
 * @author jinxianbao
 * @date 2019/4/19 10:37 AM
 */
public class Command {
    public String testString;

    public Command(String testString) {
        this.testString = testString;
    }

    public void operation() {
        System.out.println(testString);
    }
}
