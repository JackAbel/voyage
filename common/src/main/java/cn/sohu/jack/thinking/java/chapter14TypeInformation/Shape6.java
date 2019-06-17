package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description: practice
 * @author: XiangBaoJin
 * @Date
 */
public abstract class Shape6 {
    public boolean flag = false;

    public void draw() {
        System.out.println(this + ".draw()");
    }
    /**
     * @description:
     * @return: java.lang.String
     * @author: Xiangbao Jin
     * @since: 2019/5/23 11:15 PM
     */
    public abstract String toString();
}
