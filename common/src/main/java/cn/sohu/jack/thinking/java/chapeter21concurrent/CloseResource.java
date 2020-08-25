package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/25 12:06 PM
 */
public class CloseResource {
    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(8081);
        InputStream socketInput = new Socket("localhost", 8081).getInputStream();
        exec.execute(new IOBlocked(socketInput));
        exec.execute(new IOBlocked(System.in));
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Shutting down all threads");
        exec.shutdownNow();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("closing " + socketInput.getClass().getSimpleName());
        socketInput.close();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Closing " + System.in.getClass().getSimpleName());
        System.in.close(); // Releases blocked resource
    }
}
