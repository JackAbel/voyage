package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 3:41 PM
 */
public class Practice12 {
    static class Tank {
        boolean status;

        private Tank(boolean isEmpty) {
            status = isEmpty;
        }

        protected void finalize() {
            if (!status) {
                System.out.println("The tank has been clean up");
            }
        }
    }

    public static void main(String[] args) {
        /*Tank tank = new Tank(false);
        tank = null;
        System.gc();*/
        Tank tank1 = new Tank(true);
        tank1 = null;
        System.gc();
        new Tank(true);
        System.gc();
    }
}
