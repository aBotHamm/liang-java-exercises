package chapter04;

public class Exercise04_03 {
    public static void main(String[] args) {
        // Latitude (x) and longitude (y)
        double atlantaX = 33.7489954;
        double atlantaY = -84.3879824;
        double orlandoX = 28.5383355;
        double orlandoY = -81.3792365;
        double savannahX = 32.0835407;
        double savannahY = -81.0998342;
        double charlotteX = 35.2270869;
        double charlotteY = -80.8431267;

        // Convert to radians
        double atlLat = Math.toRadians(atlantaX);
        double atlLon = Math.toRadians(atlantaY);
        double orlLat = Math.toRadians(orlandoX);
        double orlLon = Math.toRadians(orlandoY);
        double savLat = Math.toRadians(savannahX);
        double savLon = Math.toRadians(savannahY);
        double chaLat = Math.toRadians(charlotteX);
        double chaLon = Math.toRadians(charlotteY);

        final double RADIUS = 6371.01;

        // Distances
        double atlOrl = RADIUS * Math.acos(
                Math.sin(atlLat) * Math.sin(orlLat)
                        + Math.cos(atlLat) * Math.cos(orlLat) * Math.cos(atlLon - orlLon));

        double orlSav = RADIUS * Math.acos(
                Math.sin(orlLat) * Math.sin(savLat)
                        + Math.cos(orlLat) * Math.cos(savLat) * Math.cos(orlLon - savLon));

        double savAtl = RADIUS * Math.acos(
                Math.sin(savLat) * Math.sin(atlLat)
                        + Math.cos(savLat) * Math.cos(atlLat) * Math.cos(savLon - atlLon));

        double savCha = RADIUS * Math.acos(
                Math.sin(savLat) * Math.sin(chaLat)
                        + Math.cos(savLat) * Math.cos(chaLat) * Math.cos(savLon - chaLon));

        double chaAtl = RADIUS * Math.acos(
                Math.sin(chaLat) * Math.sin(atlLat)
                        + Math.cos(chaLat) * Math.cos(atlLat) * Math.cos(chaLon - atlLon));

        // Triangle 1: Atlanta - Orlando - Savannah
        double s1 = (atlOrl + orlSav + savAtl) / 2;
        double area1 = Math.sqrt(s1 * (s1 - atlOrl) * (s1 - orlSav) * (s1 - savAtl));

        // Triangle 2: Atlanta - Savannah - Charlotte
        double s2 = (savAtl + savCha + chaAtl) / 2;
        double area2 = Math.sqrt(s2 * (s2 - savAtl) * (s2 - savCha) * (s2 - chaAtl));

        System.out.println("The estimated area enclosed by the four cities is " +
                (area1 + area2) + " km^2");
    }
}