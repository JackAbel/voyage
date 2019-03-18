package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 10:07 PM
 */
public class ExchangeStringChars {

    public static String StringCharExchange(String s) {
        String[] strings = s.split("");
        StringBuilder sn = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            while (i + 1 < s.length()) {
                String tmp = strings[i];
                strings[i] = strings[i+1];
                strings[i+1] = tmp;
            }
        }
        for (String w : strings) {
            sn.append(w);
        }
        return sn.toString();
    }
}
