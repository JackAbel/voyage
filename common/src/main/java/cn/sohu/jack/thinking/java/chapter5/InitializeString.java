package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/7 9:58 AM
 */
public class InitializeString {

    private String test = "st";
    private String constructorStr;
    // 构造器初始化会覆盖类定义初始化 对象产生是先调用构造器，后创建对象。
    private InitializeString(){
        this.constructorStr = "str";
        this.test = "test";
    }

    public static void main(String[] args) {
        InitializeString str = new InitializeString();
        System.out.println(str.constructorStr + "-----" + str.test);
    }
}
