package cn.sohu.jack.thinking.java.chapter3;

public class CastCoin {
    // 模拟抛硬币的程序
    public static void main(String[] args) {
        int obverseCount = 0;
        int reverseCount = 0;
        for (int i = 0; i < 1000; i++) {
            double d = Math.random();//[0,1)
            if (d >=0.5) {
                obverseCount++;
            } else {
                reverseCount++;
            }
        }

        System.out.println("the obverse side of coin is " + obverseCount);
        System.out.println("the reverse side of coin is " + reverseCount);
    }
}