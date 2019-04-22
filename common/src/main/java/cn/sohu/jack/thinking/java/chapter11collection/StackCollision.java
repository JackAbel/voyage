package cn.sohu.jack.thinking.java.chapter11collection;


/**
 * @author jinxianbao
 * @date 2019/4/16 9:35 AM
 */
public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        for (String s : "My dog have fleas".split(" ")) {
            stringStack.push(s);
        }
        System.out.println(stringStack.toString());
    }
}
