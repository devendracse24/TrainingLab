package training.ideas.java.clock_angle;

/**
 * Created by idndde on 8/10/2014.
 */
public class ClockAngle {
    public static double ClockToAngle(int hourtime,int mintime) {
        double hourtime_in_mins = hourtime*60;
        double totalhourtime=hourtime_in_mins+mintime;
        double hourAngle = .5*(totalhourtime);
        double minAngle = 6 * mintime;
        double angle = Math.abs(hourAngle - minAngle);
        angle = 360 - angle;
        return angle;

    }
}
