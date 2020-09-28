package cn.sohu.jack.design_pattens.factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 10:19 PM
 */
public class HumanFactory<T> extends AbstractHumanFactory {
    @Override
    public T createHuman(Class c) {
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }
}
