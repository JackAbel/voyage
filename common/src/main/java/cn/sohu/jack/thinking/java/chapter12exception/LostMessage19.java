package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/7 9:55 AM
 */
public class LostMessage19 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void ls() throws FourException {
        throw new FourException("live");

    }

    public static void main(String[] args) {
        try {
            LostMessage19 lm = new LostMessage19();
            try {
                lm.f();
            } catch (VeryImportantException e) {
                System.out.println(e);
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace();
        }
    }
}
