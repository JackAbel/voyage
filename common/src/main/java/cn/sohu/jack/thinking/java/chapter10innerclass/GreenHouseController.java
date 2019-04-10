package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/8 9:34 AM
 */
public class GreenHouseController extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = true;
        }

        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            light = false;
        }

        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = true;
        }

        public String toString() {
            return "Water is on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            water = false;
        }

        public String toString() {
            return "water is off";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "Thermostat on night setting";
        }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            thermostat = "Day";
        }

        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {
        public Bell(Long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restart System";
        }

    }

    public static class Terminate extends Event {
        public Terminate(Long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Terminating";
        }
    }

    private Boolean fan = false;
    public class FanOn extends Event {
        public FanOn(Long delayTime) {
            super(delayTime);
        }

        public void action() {
            fan = true;
        }

        public String toString() {
            return "fan is on";
        }
    }

    public class FanOff extends Event {
        public FanOff(Long delayTime) {
            super(delayTime);
        }

        public void action() {
            fan = false;
        }

        public String toString() {
            return "fan is off";
        }
    }
}
