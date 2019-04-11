package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;

/**
 * @author jinxianbao
 * @date 2019/4/11 11:50 AM
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("the gerbil " + gerbilNumber + " is dumping!");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (Gerbil b : gerbils) {
            b.hop();
        }
    }
}
