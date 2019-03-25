package cn.sohu.jack.thinking.java.chapter10innerclass;

import com.sun.xml.internal.rngom.digested.DPattern;
import sun.security.krb5.internal.crypto.Des;

/**
 * @author jinxianbao
 * @date 2019/3/24 9:51 PM
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLable() {
                return label;
            }
        }
        return new PDestination(s);
    }
}
