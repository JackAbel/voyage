package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description: The difference of bewteen class and instanceof
 * @author: Xiangbao Jin
 * @since 2019/6/5 9:55 PM
 */
public class FamilyVsExactType {
    static void test(Object o) {
        System.out.println("Testing o of type: " + o.getClass());
        System.out.println("o instanceof Base: " + (o instanceof Base));
        System.out.println("o instanceof Derived: " + (o instanceof Derived));
        System.out.println("Base.isInstance(o) : " + (Base.class.isInstance(o)));
        System.out.println("Derived.isInstance(o) : " + (Derived.class.isInstance(o)));
        // 这个不会考虑继承的关系
        System.out.println("o.getClass().equals(Base.class): " + (o.getClass().equals(Base.class)));
        System.out.println("o.getClass().equals(Derived.class): " + (o.getClass().equals(Derived.class)));
        System.out.println("o.getClass() == Base.class: " + (o.getClass() == Base.class));
        System.out.println("o.getClass() == Derived.class: " + (o.getClass() == Derived.class));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
        String s2 = "sg,fail,success";
    }
}
