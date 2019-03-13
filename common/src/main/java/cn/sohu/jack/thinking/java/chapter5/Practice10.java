package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 3:37 PM
 */
public class Practice10 {
    protected void finalize() {
        System.out.println("we have sense!");
    }

    public static void main(String[] args) {
        Practice10 practice10 = new Practice10();
        practice10.finalize();
    }
}
