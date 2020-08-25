package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 7:49 PM
 */
public class Item {
    private final int itemNum;

    public Item(int itemNum) {
        this.itemNum = itemNum;
    }

    public String toString() {
        return "Item " + itemNum;
    }
}
