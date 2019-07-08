package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 2:52 PM
 */
public class ExerciseClass25 implements ExerciseInterface25, ExerciseInterface252{
    public void one() {
        System.out.println("first interface");
    }

    public void two() {
        System.out.println("second interface");
    }

    public <P extends ExerciseInterface25> void firstGenericMethod(P ex) {
        System.out.println(ex.getClass().getSimpleName());
    }

    public <P extends ExerciseInterface252> void SecondGenericMethod(P ex) {
        System.out.println(ex.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        ExerciseClass25 e = new ExerciseClass25();
        e.firstGenericMethod(new ExerciseClass25());
        e.SecondGenericMethod(new ExerciseClass25());
    }
}
