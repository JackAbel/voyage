package cn.sohu.jack.thinking.java.chapter16array;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/1 9:04 AM
 */
public class ParameterizedArraytype {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodPatameter.f(ints);
        doubles2 = MethodPatameter.f(doubles);
    }
}
