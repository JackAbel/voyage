package cn.sohu.jack.thinking.java.chapter12exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jinxianbao
 * @date 2019/5/9 9:06 PM
 */
public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            // all other exceptions must close it
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close unsuccessful");
            }
            throw e;
        } finally {
            // don't close it here
        }
    }
}
