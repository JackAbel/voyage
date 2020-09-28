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
    @UseCase(id = 12, description = "live")
    public void incomplatedMethod1() {
    }
    public static void main(String[] args) {
        List<Integer> useCases= new ArrayList<>();
        Collections.addAll(useCases, 47,48,49,50);
        trackUseCase(useCases,PasswordUtils.class);

        Class useCaseTracker = UseCaseTracker.class;
        for (Method method : useCaseTracker.getMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("method name is " + method.getName());
                System.out.println("id is " + useCase.id());
                System.out.println("description is " + useCase.description());
            }
        }
    }
}
