package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/13 9:56 AM
 */
public class Frog extends Amphibian {

    @Override
    public Amphibian getAmphibian(Amphibian frog) {
        return frog;
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.getAmphibian(frog);
    }

}
