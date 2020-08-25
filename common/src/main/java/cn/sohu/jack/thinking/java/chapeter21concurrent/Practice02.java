package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 创建多个斐波拿次的线程
 * @author: Xiangbao Jin
 * @since 2019/8/4 7:50 PM
 */
public class Practice02 implements Runnable{
    private static int taskCount = 0;
    private final int id = taskCount++;
    public int n;

    public Practice02(int n) {
        this.n = n;
    }

    private Integer getFibonacci(int n1) {
        if (n1 == 0 || n1 == 1) {
            return 1;
        }
        return getFibonacci(n1-1) + getFibonacci(n1- 2);
    }

    private List<Integer> getFibonaccis() {
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            results.add(getFibonacci(i));
        }
        return results;
    }

    public void run() {
        System.out.println("taskId is "  +id + "is" + n + " : " + getFibonaccis().toString());

    }

}
