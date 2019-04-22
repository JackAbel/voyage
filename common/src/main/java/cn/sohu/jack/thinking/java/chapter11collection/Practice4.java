package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/13 8:46 PM
 */
public class Practice4 {
    static class Creater {
        List<String> movieName = Arrays.asList("snow", "white", "war", "fight");
        private static int indexInt = 0;

        public String next() {
            String favoriteMovieName = movieName.get(indexInt);
            ++indexInt;
            if (indexInt == movieName.size()) {
                indexInt = 0;
            }
            return favoriteMovieName;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> testArrayList = new ArrayList<>();
        LinkedList<String> testLinkedList = new LinkedList<>();
        Set<String> testHashSet = new HashSet<>();
        Set<String> testLinkedHashSet = new LinkedHashSet<>();
        Set<String> testTreeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            testArrayList.add(new Creater().next());
            testLinkedList.add(new Creater().next());
            testHashSet.add(new Creater().next());
            testLinkedHashSet.add(new Creater().next());
            testTreeSet.add(new Creater().next());
        }
        System.out.println(testArrayList);
        System.out.println(testLinkedList);
        System.out.println(testHashSet);
        System.out.println(testLinkedHashSet);
        System.out.println(testTreeSet);
    }
}
