package KNUJavaProgramming.FirstWeek;

public class CelciusToFarenheit {
    public static void main(String[] args) {

        double[] celTemps = {-40.0, -18.0, 10.0, 30.0, 40.0, 100.0};
        double farTemp;

        for (double i = 0; i < celTemps.length; i++) {
            farTemp = celTemps[(int) i] * 9.0 / 5.0 + 32.0;
            System.out.println("C = " + celTemps[(int) i] + " --> F = " + farTemp);
        }
    }
}
