package cn.sohu.jack.thinking.java.chapter3;

public class AtuoInt {
    //静态方法里面的变量都是静态的，这样的说法并不正确，只能说静态方法只能引用静态成员变量，它的内部可以定义非静态的变量
    public static void main(String[] args) {
        int i = 2;
        System.out.println("++i : " + ++i);
        System.out.println("--i : " + --i);
        System.out.println("i++ : " + i++);
        System.out.println("i-- : " + i--);
        System.out.println("i ： " + i);
    }

}
