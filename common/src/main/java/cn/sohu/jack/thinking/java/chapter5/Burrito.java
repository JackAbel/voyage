package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/10 3:31 PM
 */
public class Burrito {
    private Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describle() {
        System.out.print("This Burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all!");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot!");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("very hot!");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT);
        Burrito greenChile = new Burrito(Spiciness.MEDIUM);
        Burrito jalapeno = new Burrito(Spiciness.HOT);
        plain.describle();
        greenChile.describle();
        jalapeno.describle();
    }
}
