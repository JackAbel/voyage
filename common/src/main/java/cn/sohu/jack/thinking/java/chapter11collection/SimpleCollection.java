package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author jinxianbao
 * @date 2019/4/11 12:02 PM
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> simpleCollection = new ArrayList<>();
        Collection<Integer> c = new Set<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        for (int i = 0; i < 10; i++) {
            ((ArrayList<Integer>) simpleCollection).add(i);
        }
        for (Integer i : simpleCollection) {
            System.out.print(i + " ");
        }
    }
}
