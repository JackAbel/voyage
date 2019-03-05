package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/5 9:47 PM
 */
public class FindPrime {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int y = 1; y <= i; y++){
                int remainder = i % y;
                boolean isPrime = y != 1 && y < i && remainder == 0;
                if (i == 1) {
                    System.out.println(i + " is prime!");
                } else if (isPrime){
                    System.out.println("-------------------");
                    break;

                } else if (y == i){
                    System.out.println(i + " is prime!");
                }
            }
        }
    }
}
