package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 9:34 PM
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls spaceShipControls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    // Delegated method
    public void back(int velocity) {
        spaceShipControls.back(velocity);
    }

}
