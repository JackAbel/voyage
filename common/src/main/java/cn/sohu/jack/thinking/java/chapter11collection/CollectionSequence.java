package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @author jinxianbao
 * @date 2019/4/21 3:09 PM
 */
public class CollectionSequence extends AbstractCollection<String> {
    private String[] strings = new String[8];

    public int size() {
        return strings.length;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < strings.length;
            }

            @Override
            public String next() {
                return strings[index++];
            }
        };
    }
}
