package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/19 9:56 PM
 */
public class Implementation2Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}
