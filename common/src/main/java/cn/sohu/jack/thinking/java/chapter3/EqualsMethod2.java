package cn.sohu.jack.thinking.java.chapter3;

public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 12;

        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);

        String s1 = "love";
        String s2 = "love";
        //Object equals of default is compare object's quote
        System.out.println(v1.equals(v2));// false
        //equals is compare object content;
        System.out.println(i1.equals(i2));
        //every type has themselves equals;
        System.out.println(s1.equals(s2));
    }
}
