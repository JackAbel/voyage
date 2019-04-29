package cn.sohu.jack.thinking.java.chapter12exception;

import java.util.logging.Logger;

/**
 * @author jinxianbao
 * @date 2019/4/22 12:06 PM
 */
public class Practice3 {
    private static Logger logger = Logger.getLogger("");
    public static void main(String[] args) {
        String[] s = new String[4];
        try {
            System.out.println(s[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe(e.getMessage());
            e.printStackTrace();
        }
    }
}
