package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author jinxianbao
 * @date 2019/4/16 11:21 AM
 */
public class Practice17 {
    private static Map<String, Gerbil> gerbilMap = new HashMap<>();

    public static void main(String[] args) {
        gerbilMap.put("Jack", new Gerbil(12));
        gerbilMap.put("Ali", new Gerbil(1));
        gerbilMap.put("Marry", new Gerbil(2));
        gerbilMap.put("Json", new Gerbil(122));
        Iterator<String> gerbileMapKeys = gerbilMap.keySet().iterator();
        System.out.println(gerbilMap.keySet());
        while (gerbileMapKeys.hasNext()) {
            String p = gerbileMapKeys.next();
            System.out.println(p);
            gerbilMap.get(p).hop();
        }
    }
}
