package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/25 9:33 AM
 */
public class Parcel9 {
    public Destination destination(String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("sg");
        System.out.println(d.readLable());
    }

}
