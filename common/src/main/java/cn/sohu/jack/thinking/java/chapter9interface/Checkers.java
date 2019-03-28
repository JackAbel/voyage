package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 8:55 PM
 */
public class Checkers implements Game {
    private Checkers() {

    }
    private int moves = 0;
    private static final int MOVE = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVE;
    }

    public static GameFactory game  = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}
