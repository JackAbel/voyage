package cn.sohu.jack.test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/9 7:41 PM
 */
public class SPIMain {
    public static void main(String[] args) {
        ServiceLoader<IShout> shoutServiceLoader = ServiceLoader.load(IShout.class);
        Iterator<IShout> iterators = shoutServiceLoader.iterator();
        while (iterators.hasNext()) {
            System.out.println("----");
            iterators.next().iSHout();
        }
    }
}
