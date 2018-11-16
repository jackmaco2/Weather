public class Weather {

    private Temperature tem = new Temperature();
    private int humidity = 0;
    private int windspeed = 0;
    private String windDirection = "E";

    public void Weather() {
        tem.Temperature();
        humidity = 50;
        windspeed = 0;
        windDirection = "W";
    }

    public void Weather(double temp, char s) {
        tem.set(temp, s);
    }

    public int getTemp() {
        return (int)tem.getTemp();
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSp() {
        return windspeed;
    }

    public String getWindDir() {
        return windDirection;
    }

    public void setTemperature (Temperature temp) {
        temp.setTemp() = tem.getTemp();
    }

    public void setHumidity (int humid) {
        if (humid >= 0 && humid <= 100) {
            humidity = humid;
        }
    }

    public void setWindSp(int speed) {
        if (speed >= 0) {
            windspeed = speed;
        }
    }

    public void setWindDir(String dir) {
        if (dir.equals("E")) {
            windDirection = dir;
        }
        if (dir.equals("N")) {
            windDirection = dir;
        }
        if (dir.equals("W")) {
            windDirection = dir;
        }
        if (dir.equals("S")) {
            windDirection = dir;
        }
        if (dir.equals("NW")) {
            windDirection = dir;
        }
        if (dir.equals("SW")) {
            windDirection = dir;
        }
        if (dir.equals("SE")) {
            windDirection = dir;
        }
        if (dir.equals("NE")) {
            windDirection = dir;
        }
    }

    public String toString() {
        String ret = String.format("The weather is currently %d with %d%% humidity and a %d mph wind from the %s", tem.getTemp(), humidity, windspeed, windDirection);
        return ret;
    }

    public boolean equals(Weather other) {
        boolean test = false;
        if (other.getTemp() == tem.getTemp() && other.getHumidity() == humidity) {
            test = true;
        }
        return true;
    }
}