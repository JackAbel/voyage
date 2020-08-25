package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 7:52 PM
 */
public class Producer implements Runnable {
    private int count = 0;
    private Market24 market24;

    public Producer(Market24 m) {
        market24 = m;
    }

    protected int getCount() {
        return count;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                while (count < 100) {
                    Item item = new Item(++count);
                    if (market24.items.offer(item)) {
                        System.out.println("produced " + item);
                        // notify consumer that item available
                        synchronized (market24.consumer) {
                            market24.consumer.notifyAll();
                        }
                    }
                    // storage holds 10 items
                    synchronized (this) {
                        while (!(market24.items.size() < 10)) {
                            wait();
                        }
                    }
                }
            }
            // stop production after 100 Items
            System.out.println("produced " + count + " Items \n stopped" );
        } catch (InterruptedException e) {
            System.out.println("producer interrupted");
        }

    }
}
