package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/17 8:39 PM
 */
public class BankTeller {
    public static void serve(Customer.Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        for (int i = 0; i < 15; i++) {
            line.add((Customer)Customer.generator().next());
        }
        Queue<Customer.Teller> tellers = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            tellers.add((Customer.Teller)Customer.Teller.generator.next());
        }
        for (Customer c : line) {
            serve(((LinkedList<Customer.Teller>) tellers).get(rand.nextInt(tellers.size())), c);
        }

    }
}
