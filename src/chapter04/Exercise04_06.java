package chapter04;

public class Exercise04_06 {
    public static void main(String[] args) {
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        double x1 = 40 * Math.cos(angle1);
        double y1 = 40 * Math.sin(angle1);

        double x2 = 40 * Math.cos(angle2);
        double y2 = 40 * Math.sin(angle2);

        double x3 = 40 * Math.cos(angle3);
        double y3 = 40 * Math.sin(angle3);

        double side1 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double side2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double side3 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        double angleA = Math.toDegrees(Math.acos(
                (side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));

        double angleB = Math.toDegrees(Math.acos(
                (side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3)));

        double angleC = Math.toDegrees(Math.acos(
                (side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2)));

        System.out.println("(" + x1 + "," + y1 + ") = " + angleA);
        System.out.println("(" + x2 + "," + y2 + ") = " + angleB);
        System.out.println("(" + x3 + "," + y3 + ") = " + angleC);
    }
}
