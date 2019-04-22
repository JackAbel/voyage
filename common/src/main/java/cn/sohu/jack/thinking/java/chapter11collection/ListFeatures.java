package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/14 11:40 AM
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> pets = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("1: " + pets);
        pets.add(6);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(6));
        Integer i = pets.get(2);
        System.out.println("4: " + i + pets.indexOf(i));
        System.out.println("5: " + pets.indexOf(7));
        Integer seven = 7;
        System.out.println("6: " + pets.remove(seven));
        System.out.println("7: " + pets.remove(i));
        System.out.println("8: " + pets);
        pets.add(3,40);
        System.out.println("9: " + pets);
        List<Integer> subPets = pets.subList(1, 3);
        System.out.println("subList: " + subPets);
        System.out.println("10: " + pets.containsAll(subPets));
        Collections.sort(subPets);
        System.out.println("sorted sublist: " + subPets);
        Collections.shuffle(subPets, rand);
        System.out.println("shuffled sublist: " + subPets);
        System.out.println("11: " + pets.containsAll(subPets));
        List<Integer> copy = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        subPets = Arrays.asList(1, 4);
        System.out.println("subPets:" + subPets);
        copy.retainAll(subPets);

    }

}
