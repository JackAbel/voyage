package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/20 9:44 AM
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    private class PDestination implements Destination {
        private String label;

        private PDestination(String w) {
            label = w;
        }

        public String readLable() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents content() {
        return new PContents();
    }
}
