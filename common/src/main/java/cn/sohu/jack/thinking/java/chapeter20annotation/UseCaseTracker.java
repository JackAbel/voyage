package cn.sohu.jack.thinking.java.chapeter20annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 12:08 PM
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> li, Class<?> c1) {
        for (Method m : c1.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                li.remove(new Integer(uc.id()));
            }

        }

        for (int i : li) {
            System.out.println("Warning: Missing the use case - " + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases= new ArrayList<>();
        Collections.addAll(useCases, 47,48,49,50);
        trackUseCase(useCases,PasswordUtils.class);
    }
}
