package cn.sohu.jack.thinking.java.chapter3;

public class Dog {
    String name = "";
    String says = "";

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf";
        Dog spot2 = spot;
        System.out.println("spot2 == spot: " + (spot2 == spot));
        System.out.println("spot equals spot2: " + (spot2.equals(spot)));
    }
}
