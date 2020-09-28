package cn.sohu.jack.test;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/2 10:53 PM
 */
public enum Season {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    private int code;

    private Season(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
