package cn.sohu.jack.thinking.java.chapter11collection;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author jinxianbao
 * @date 2019/4/17 10:42 AM
 */
public class StringInteger {

    public String word;
    public Integer num = 0;

    public StringInteger(String word, Integer num) {
        this.word = word;
        this.num = num;
    }
    @Override
    public boolean equals(Object o) {
        if (this.word.equals(((StringInteger) o).word)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return word + " = " + num;
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }
}
