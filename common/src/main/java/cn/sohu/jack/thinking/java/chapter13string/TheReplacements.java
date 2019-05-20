package cn.sohu.jack.thinking.java.chapter13string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jinxianbao
 * @date 2019/5/18 4:02 PM
 */
public class TheReplacements {
    public static void replacementTest(String arg) {
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(arg);
        if (mInput.find()) {
            arg = mInput.group(1); //Captured by parentheses
        }
        // Replace two or more spaces with one space
        arg = arg.replaceAll(" {2,}", " ");
        // Replace one or more spaces at the beginning of each
        // line with no spaces, Must enable MULTILINE mode
        arg = arg.replaceAll("(?m)^ +", "");
        System.out.println(arg);
        arg = arg.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(arg);
        // Process the find information as you
        // perform the replacements:
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);

    }

    public static void main(String[] args) {
        replacementTest("/*! Here's a block of text to use as input to \n" +
                "the regular expression matcher. Note that we'll\n" +
                "first extract the block of text by looking for\n" +
                "the special delimiters, then process the\n" +
                "extracted block. !*/");
    }
}
