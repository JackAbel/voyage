package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 9:06 PM
 */
public class OSExecute {
    public static void command(String command) throws Exception{
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader errResults = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String s;
            while ((s = results.readLine()) != null) {
                System.out.println(s);
            }
            while ((s = errResults.readLine()) != null) {
                System.err.println(s);
                err =true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (err) {
            throw new Exception("Errors executing " + command);
        }
    }
}
