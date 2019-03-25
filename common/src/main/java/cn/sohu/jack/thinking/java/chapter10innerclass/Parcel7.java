package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/25 9:26 AM
 */
public class Parcel7 {
    public Contents contents() {
        // 返回类型和类的定义放在一起，类没有名字
        return new Contents() {
            @Override
            public int value() {
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
        System.out.println(c.value() + "________");
    }
}
