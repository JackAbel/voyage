package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 8:49 PM
 */
public class Cartoon {

    class Art {
        protected Art() {
            System.out.println("create Art()");
        }
    }

    class Drawing extends Art {
        protected Drawing() {
            System.out.println("create Drawing()");
        }
    }

    class Cartoon2 extends Drawing {
        protected Cartoon2() {
            System.out.println("create Cartoon2()");
        }
    }

    public Cartoon() {
        Cartoon2 cartoon2 = new Cartoon2();
    }
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }

    class Game {
        protected Game(int i) {
            System.out.println("create Game(" + i + ")");
        }
    }

    class BoardGame extends Game {
        protected BoardGame(int j) {
            super(j);
            System.out.println("BoardGame Constructor!");
        }
    }
}
