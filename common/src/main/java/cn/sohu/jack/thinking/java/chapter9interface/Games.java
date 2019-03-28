package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 9:03 PM
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) {
            ;
        }
    }

    public static void main(String[] args) {
        playGame(Checkers.game);
        playGame(Chess.game);
    }
}
