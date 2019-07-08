package cn.sohu.jack.thinking.java.chapter17deepcollection;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/4 5:57 PM
 */
public class StringBuild {
    private String s;

    public StringBuild(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}
