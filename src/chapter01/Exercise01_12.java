package chapter01;

public class Exercise01_12 {
    public static void main(String[] args) {
        //24 miles in 1 hour 40 min and 35 sec
        //miles to km
        double milesToKM = 24 * 1.6;
        double seconds = (60 * 60 + (60 * 40) + 35);
        System.out.println(((24*1.6)/seconds)*3600 );
    }

}
