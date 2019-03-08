package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/7 10:19 AM
 */
public class OverLoading {
    static class Tree {
       int height;
       Tree() {
           System.out.println("Planting a seedling");
           height = 0;
       }

       Tree(int initHeight) {
           height = initHeight;
           System.out.println("Creating a tree that is " + height + " feet tall" );
       }

        Tree(Integer sg) {
            System.out.println(sg);

        }

       void info() {
           System.out.println("Tree is " + height + " feet tall");
       }
       void info(String s) {
           System.out.println(s + " tree is " + height + " feet tall");
       }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overLoad method");
            System.out.println();
        }
        new Tree();
    }

}
