package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 9:19 PM
 */
public class OXExecuteDemo {
    public static void main(String[] args) {
        try {
            //OSExecute.command("javap Users.xiangbao.Documents.JavaProjects.voyage.common.src.main.java.cn.sohu.jack.thinking.java.chapter18javaIOsystem.OXExecuteDemo");
            OSExecute.command("ls");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
