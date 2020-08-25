package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 6:17 PM
 */
public class Receiver implements Runnable {
    public PipedReader in;

    public Receiver(Sender sender) throws IOException {
        in = new PipedReader(sender.getOut());
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Read " + (char)in.read() + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
