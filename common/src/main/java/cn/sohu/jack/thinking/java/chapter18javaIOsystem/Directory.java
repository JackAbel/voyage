package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/16 10:24 AM
 */
public class Directory {
    public static File[] local(File dir, String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo treeInfo = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                treeInfo.dirs.add(item);
                treeInfo.addAll(recurseDirs(item, regex));
            } else {
                if (item.getName().matches(regex)) {
                    treeInfo.files.add(item);
                }
            }
        }
        return treeInfo;
    }

    public static TreeInfo walk(String start, String regex) {
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(walk("."));
        } else {
            for (String arg : args) {
                System.out.println(walk(arg));
            }
        }
    }
}
