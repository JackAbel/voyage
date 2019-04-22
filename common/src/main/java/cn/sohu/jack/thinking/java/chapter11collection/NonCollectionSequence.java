package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/21 3:21 PM
 */
public class NonCollectionSequence extends PetSequence implements Iterable {
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

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable reversed() {
        return new Iterable() {
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    int currentIndex = strings.length - 1;
                    @Override
                    public boolean hasNext() {
                        return currentIndex > -1;
                    }

                    @Override
                    public Object next() {
                        return strings[currentIndex--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> st = new ArrayList<>(Arrays.asList(strings));
                Collections.shuffle(st, new Random(47));
                return st.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
