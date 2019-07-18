package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/16 10:18 PM
 */
public class MakeDirectories {
    private static void usage() {
        System.out.println("++");
    }

    private static void fileData(File file) {
        System.out.println(
                "Absolute path: " + file.getAbsolutePath() +
                        "\n Can read: " + file.canRead() +
                        "\n Can write: " + file.canWrite() +
                        "\n getName: " + file.getName() +
                        "\n getPath: " + file.getPath() +
                        "\n length: " + file.length() +
                        "\n lastModified: " + file.lastModified()
        );

        if (file.isDirectory()) {
            System.out.println("It's a directory");
        } else if (file.isFile()) {
            System.out.println("It's a file");
        }
    }

    public static void main(String[] args) {
        if (args[0].equals("-r")) {
            File old = new File(args[1]);
            File rname = new File(args[2]);
            old.renameTo(rname);
            fileData(old);
            fileData(rname);
            return;
        }
        int count = 0;
        boolean del = false;
        if (args[0].equals("-d")) {
            count++;
            del = true;
        }

        count--;
        while (++count < args.length) {
            File file = new File(args[count]);
            if (file.exists()) {
                System.out.println(file + " exist");
                if (del) {
                    System.out.println("deleting..." + file);
                    file.delete();
                }
            } else {
                if (!del) {
                    file.mkdirs();
                    System.out.println("created " + file);
                }
            }
            fileData(file);

        }

    }
}
