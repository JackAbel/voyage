package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 8:55 PM
 */
public class Chess implements Game {
    private Chess() {

    }
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory game  = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
