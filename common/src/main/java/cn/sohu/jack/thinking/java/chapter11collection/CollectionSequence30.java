package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author jinxianbao
 * @date 2019/4/21 3:27 PM
 */
public class CollectionSequence30 implements Collection<String> {

    private String[] strings = ("math English chinese biology").split(" ");
    @Override
    public int size() {
        return strings.length;
    }
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        for (String s : strings) {
            if (s.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean addAll(Collection<? extends String> s) {
        throw new UnsupportedOperationException();
    }
    public boolean containsAll(Collection<?> s) {
        throw new UnsupportedOperationException();
    }
    public boolean add(String s) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }
    public void clear() {
        if (this.size() != 0) {
            for (String s : strings) {
                s = null;
            }
        }
    }

    @Override
    public String[] toArray() {
        return strings;
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
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
