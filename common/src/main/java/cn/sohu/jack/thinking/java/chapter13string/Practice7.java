package cn.sohu.jack.thinking.java.chapter13string;

/**
 * @author jinxianbao
 * @date 2019/5/18 2:30 PM
 */
public class Practice7 {
    public static void main(String[] args) {
        String test = "Age.";
        String test2 = "Sage";
        System.out.println(test.matches("^[A-Z].*[\\.]$"));
        System.out.println(test2.matches("^[A-Z].*[\\.]$"));
    }
}
