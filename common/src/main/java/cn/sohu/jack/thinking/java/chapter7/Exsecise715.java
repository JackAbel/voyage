package cn.sohu.jack.thinking.java.chapter7;

import cn.sohu.jack.thinking.java.chapter7.Cleanser;

/**
 * @author jinxianbao
 * @date 2019/3/12 10:01 AM
 */
public class Exsecise715 {
    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        // 在包外不能调用protected方法
        cleanser.apply();
    }
}
