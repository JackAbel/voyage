package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 8:41 PM
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500);
        Sleeper grumpy = new Sleeper("grumpy", 1500);

        Joiner dopey = new Joiner("Dopey", sleepy);
        Joiner doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
