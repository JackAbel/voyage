package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 9:56 PM
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() {
        return "result of task is " + id;
    }
}
