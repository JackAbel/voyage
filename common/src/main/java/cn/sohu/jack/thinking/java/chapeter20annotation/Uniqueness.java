package cn.sohu.jack.thinking.java.chapeter20annotation;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(uniqueKey = true);
}
