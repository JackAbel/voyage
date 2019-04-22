package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Map;

/**
 * @author jinxianbao
 * @date 2019/4/21 6:15 PM
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
