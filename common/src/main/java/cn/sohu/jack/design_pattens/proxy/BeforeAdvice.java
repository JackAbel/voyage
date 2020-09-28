package cn.sohu.jack.design_pattens.proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 5:16 PM
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我被执行了，提前通知");
    }
}
