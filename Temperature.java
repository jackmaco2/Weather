import java.util.Scanner;

public class Temperature {
    private static double degrees = -50.0;
    private static char scale = 'C';

    public void Temperature () {
        scale = 'C';
        degrees = 0;
    }

    public void Temperature (int temp, char s){
        if (temp < 150 && temp > -50) {
            degrees = temp;
        }
        if (Charcter.toUpperCase(s) == 'C' || Character.toUpperCase(s) == 'F') {
            scale = s;
        }
    }

    public double getTemp() {
        return degrees;
    }

    public char getScale () {
        return scale;
    }

    public void set (double temp, char s) {
        if (temp < 150 && temp > -50) {
            if (Charcter.toUpperCase(s) == 'C' || Character.toUpperCase(s) == 'F') {
                s = scale;
                degrees = temp;
            }
        }
    }

    public void setTemp(double temp) {
        if (temp < 150 && temp > -50) {
            degrees = temp;
        }
    }

    public void setScale (char s) {
        if (Charcter.toUpperCase(s) == 'C' || Character.toUpperCase(s) == 'F') {
            s = scale;
        }
    }

    public String toString () {
        System.out.println(degrees + " degrees " + scale);
    }

    public boolean equals(Temperature other) {
        boolean test = false;
        if (other.getTemp() == Math.round(convertCtoF(convertFtoC(degrees)))) {
            test = true;
        }
        return test;
    }

    public double convertFtoC(double temp) {
        return ((temp - 32) * (5/9));
    }

    public double convertCtoF(double temp) {
        return ((temp * (9/5)) + 32);
    }
}