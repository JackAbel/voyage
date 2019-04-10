package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 11:31 AM
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass llc = new LocalInnerClass();
        Counter c1 = llc.getCounter("Local Inner");
        Counter c2 = llc.getCounter2("Anonymous Inner");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(c2.next());
        }
    }
}
