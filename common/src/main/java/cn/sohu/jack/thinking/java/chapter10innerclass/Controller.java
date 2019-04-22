package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.E;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/8 9:22 AM
 */
public class Controller {
    // private List<Event> events = new ArrayList<Event>();
    private List<Event> events = new LinkedList<Event>();
    public void addEvent(Event event) {
        events.add(event);
    }

    public void run() {
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            for (Event e : new LinkedList<Event>(events)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    events.remove(e);
                }
            }
        }
    }
}
