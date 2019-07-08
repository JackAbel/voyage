package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 4:57 PM
 */
public class ClassTypeCapture<T> {
    Class<T> kind;
    Map<String, Class<?>> map;
    public ClassTypeCapture(Class<T> kind, Map<String, Class<?>> map) {
        this.kind = kind;
        this.map = map;
    }

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
       return kind.isInstance(arg);
    }

    public void addType(String typeName, Class<?> kind) {
        map.put(typeName, kind);
    }

    public Object createNew(String typename) throws IllegalAccessException, InstantiationException{
        if (map.containsKey(typename)) {
            return map.get(typename).newInstance();
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        ClassTypeCapture<Building> ctt = new ClassTypeCapture<Building>(Building.class, new HashMap<String, Class<?>>());
        ctt.addType("House", House.class);
        ctt.addType("Building", Building.class);
        System.out.println("ctt.map = " + ctt.map);
        try {
            Building b = (Building)ctt.createNew("Building");
            House h = (House) ctt.createNew("House");
            System.out.print("b instanceof Building: ");
            System.out.println(b instanceof Building);
            String s = (String) ctt.createNew("String");
            System.out.println(s instanceof String);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
