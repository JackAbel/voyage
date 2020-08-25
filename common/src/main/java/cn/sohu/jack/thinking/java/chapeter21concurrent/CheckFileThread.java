package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 5:31 PM
 */
public class CheckFileThread implements Runnable{

    public void run() {
        while (true) {
            if (new File("/Users/xiangbao/work/sohu/test/test.sh").exists()) {
                FileIsExist.setExist(true);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    FileIsExist.setExist(false);
                    e.printStackTrace();
                }
            } else {
                FileIsExist.setExist(false);
                System.out.println("文件获取不到");
                System.exit(0);
            }
        }

    }
}
