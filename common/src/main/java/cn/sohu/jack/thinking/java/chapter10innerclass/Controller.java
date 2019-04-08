package cn.sohu.jack.thinking.java.chapter10innerclass;

import cn.sohu.jack.thinking.java.chapter9interface.E;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/8 9:22 AM
 */
public class Controller {
    private List<Event> events = new ArrayList<Event>();
    public void addEvent(Event event) {
        events.add(event);
    }

    public void run() {
        while (events.size() > 0) {
            for (Event e : new ArrayList<Event>(events)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    events.remove(e);
                }
            }
        }
    }
}
