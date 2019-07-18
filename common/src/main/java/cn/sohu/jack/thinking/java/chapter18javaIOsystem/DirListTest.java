package cn.sohu.jack.thinking.java.chapter18javaIOsystem;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DirListTest {
    public static void main(String[] args) {
        String[] we = {"-r","/Users/xiandggbao/work/sohu/test/test.py", "/Users/xiangbao/work/sohu/test/test02.py"};
        MakeDirectories.main(we);
    }
}