package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/17 8:26 PM
 */
public class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() { }

    public String toString() {
        return "Customer" + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }

    static class Teller {
        private long counter = 1;
        private final long id = counter++;

        private Teller() { }

        public String toString() {
            return "Teller" + id;
        }

        public static Generator<Teller> generator = new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}
