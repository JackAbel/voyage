package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/9 9:46 AM
 */
public class StormyInning extends Inning implements Storm {
    // OK to add new exception for constructors, but you
    // must deal with the base constructor exceptions
    public StormyInning() throws RainedOut, BaseballException { }
    public StormyInning(String s) throws Foul, BaseballException { }
    // Regular methods must conform to base class;
    // void walk() throws PopFoul { } Compile error
    public void walk() {
    }
    // Interface CANNOT add exceptions to existing methods from the base class
    // !public void event() throws RainedOut { }
    // If the method doesn't exist in the base class, add exception is ok
    public void rainHard() throws RainedOut {
    }
    // You can choose to not throw any exceptions, even if the base version does;
    public void event() {
    }

    public void atBat() throws PopFoul {
        // overridden methods can throw inherited exception
    }

    public static void main(String[] args) {
        try {
            StormyInning stormyInning = new StormyInning();
            stormyInning.atBat();
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version

        try {
            Inning i = new StormyInning();
            i.atBat();
            // you must catch the exceptions from the base-class version of the method
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
