package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/9 9:29 PM
 */
public class Human {
    public static void main(String[] args) {
        // Catch the exact type;
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
        try {
            throw new Sneeze();
        } catch (Annoyance sneeze) {
            System.out.println("Caught Annoyance");
        }
    }
}
