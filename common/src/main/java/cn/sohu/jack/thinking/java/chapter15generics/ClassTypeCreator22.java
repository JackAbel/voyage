package cn.sohu.jack.thinking.java.chapter15generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 10:23 AM
 */
public class ClassTypeCreator22<T> {
    Class<?> kind;

    public ClassTypeCreator22(Class<?> kind) {
        this.kind = kind;
    }

    public Object createNew(String typeName)
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {
        return Class.forName(typeName).newInstance();
    }

    public Object createNew(String typeName, Object... args)
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException {
        switch (args.length) {
            case 1 : return Class.forName(typeName).getConstructor(args[0].getClass()).newInstance(args[0]);
            case 2 : return Class.forName(typeName).getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0], args[1]);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Building.class);
        ClassTypeCreator22<Building> ctcb = new ClassTypeCreator22<>(Building.class);
        ClassTypeCreator22<House22> ctch = new ClassTypeCreator22<>(House22.class);
        try {
            Building b = (Building)ctcb.createNew("cn.sohu.jack.thinking.java.chapter15generics.Building");
            System.out.println("House constructors: ");
            Constructor[] conts = House22.class.getConstructors();
            for (Constructor c : conts) {
                System.out.println(c);
            }
            // create three new House
            //House h1 = (House)ctch.createNew("cn.sohu.jack.thinking.java.chapter15generics.House22","huahua");
            House22 h2 = (House22)ctch.createNew("cn.sohu.jack.thinking.java.chapter15generics.House22",300);
            House22 h3 = (House22)ctch.createNew("cn.sohu.jack.thinking.java.chapter15generics.House22",300, "huahua");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
