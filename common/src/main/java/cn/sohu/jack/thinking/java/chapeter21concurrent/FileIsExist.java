package cn.sohu.jack.thinking.java.chapeter21concurrent;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 5:45 PM
 */
public class FileIsExist {
    private static boolean exist1 = true;

    public static synchronized boolean getExist() {
        return exist1;
    }

    public static void setExist(boolean exist2) {
        exist1 = exist2;
    }
}
