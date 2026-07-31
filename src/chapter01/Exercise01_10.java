package chapter01;

public class Exercise01_10 {
    public static void main() {
        /* assume that a runner runs 14 kilometer in 45 min
        * and 30 seconds. What is the average speed in mph.
        * 1 mile = 1.6km */

        // convert km to miles
        double kmToMPH = 14/1.6;
        double hours = (double) 2730 /3600;
        System.out.print(kmToMPH/hours);
    }
}
