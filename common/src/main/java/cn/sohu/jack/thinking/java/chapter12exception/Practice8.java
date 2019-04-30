package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/30 7:36 PM
 */
public class Practice8 {

    static void f() throws FourException{
        System.out.println("Declare Exception");
        throw new FourException("live");
        /*try {
            throw new FourException("tian");
        } catch (FourException e) {
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) throws Exception{
        f();
    }
}
