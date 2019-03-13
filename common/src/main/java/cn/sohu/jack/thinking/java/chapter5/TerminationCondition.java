package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 3:17 PM
 */
public class TerminationCondition {
    static class Book {
        boolean checkedOut = false;

        Book(boolean checkOut) {
            checkedOut = checkOut;
        }

        void checkIn() {
            checkedOut = false;
        }

        protected void finalize() {
            if (checkedOut) {
                System.out.println("Error: checked out!");
            }
            /*try {
                super.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }*/
        }
    }

    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper clean up
        novel.checkIn();
        // Drop the reference, forget to clean up
        new Book(true);
        // Force garbage collection & finalization
        System.gc();
    }
}
