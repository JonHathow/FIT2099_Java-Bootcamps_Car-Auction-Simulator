package Bootcamps.Bootcamp05.fit2099;
import java.util.Random;

/**
 * Utils class is a class which contains static methods which can be used in any other class.
 * This is version 5 of this class, as it is from Week 5's Bootcamp.
 *
 * @author How Yu Chern
 * @version 1.0.0
 */
public class Utils {
    public static int nextID() {
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }
}
