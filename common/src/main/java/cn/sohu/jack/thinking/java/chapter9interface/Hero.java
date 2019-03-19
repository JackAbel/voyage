package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/19 9:51 AM
 */
public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() { }
    public void fly() { }
    public void climb() { }
}
