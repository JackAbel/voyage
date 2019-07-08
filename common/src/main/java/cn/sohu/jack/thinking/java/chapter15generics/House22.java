package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 5:58 PM
 */
public class House22 extends Building {
    private String location;
    private Integer area;

    public House22() {
        location = null;
    }

    public House22(Integer area) {
        this.area = area;
    }

    public House22(Integer area, String location) {
        this.area = area;
        this.location = location;
    }

    public String toString() {
        return "House" + ((location == null) ? "" : " in " +location) + ((area != null) ? (", " + area + " sqft") : "");
    }
}
