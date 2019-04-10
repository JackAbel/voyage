package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/10 10:17 AM
 */
public class GreenHouseControllers {
    public static void main(String[] args) {
        GreenHouseController gc = new GreenHouseController();
        // instead of wiring hard; parse configuration from a text file
        gc.addEvent(gc.new Bell(900L));
        Event[] eventlist = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200L),
                gc.new LightOff(400L),
                gc.new WaterOn(600L),
                gc.new WaterOff(800L),
                gc.new ThermostatDay(1400)
                };
        gc.addEvent(gc.new Restart(2000L, eventlist));
        if (args.length == 1) {
            gc.addEvent(new GreenHouseController.Terminate(new Long(args[0])));
        }
        gc.run();
    }
}
