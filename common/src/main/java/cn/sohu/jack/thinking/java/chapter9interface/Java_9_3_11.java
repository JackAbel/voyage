package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 10:01 AM
 */
public class Java_9_3_11 implements ProcessImpl {

    ExchangeStringChars exchangeStringChars;

    public Java_9_3_11(ExchangeStringChars exchangeStringChars) {
        this.exchangeStringChars = exchangeStringChars;
    }

    public String name() {
        return exchangeStringChars.getClass().getSimpleName();
    }

    public String process(Object input) {
        return exchangeStringChars.StringCharExchange((String) input);
    }

    public static void main(String[] args) {
        String s = "ps";
        Apply.process(new Java_9_3_11(new ExchangeStringChars()), s);
    }

}
