package cn.sohu.jack.thinking.java.chapter3;

public class Assignment {

    // 对象引用练习
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 18;
        t1 = t2;
        System.out.println("t1 level:" + t1.level);
        t1.level = 27;
        System.out.println("t2 level:" + t2.level);
        t2.level =30;
        System.out.println("t1 level:" + t1.level);

        Letter l = new Letter();
        l.c = 'a';
        PassObject.f(l);
        System.out.println(l.c);
    }


    static class Tank {
        int level;
    }
    static class Letter {
        char c;
    }

    public static class PassObject {
        static void f(Letter y){
            y.c = 'z';
        }
    }
}
