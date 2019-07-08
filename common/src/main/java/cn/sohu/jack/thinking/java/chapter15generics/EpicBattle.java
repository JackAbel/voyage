package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 12:04 PM
 */
public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNosies();
    }

    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNosies();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        List<? extends SuperHearing> audioSuper;
        // List<? extends SuperHearing & SuperSmell> audioSuper2; can't do this
    }
}
