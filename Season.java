public class Season {

    private static String season = "winter";

    public void Season() {
        season = "winter";
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String newseason) {
       // System.out.println(newseason);
        String lower = newseason.toLowerCase();
        //System.out.println(lower);
        if (lower.equals("spring")) {
            season = newseason;
        }
        if (lower.equals("summer")) {
            season = newseason;
        }
        if (lower.equals("winter")) {
            season = newseason;
        }
        if (lower.equals("fall")) {
            season = newseason;
        }
        if (lower.equals("autumn")) {
            season = newseason;
        }
    }

    public String toString() {
        return season;
    }

    public boolean equals(Season other) {
        boolean test = false;
        if (other.getSeason().equals(season)) {
            test = true;
        }
        else if (other.getSeason().equals("fall") && season.equals("autumn")) {
            test = true;
        }
        else if (other.getSeason().equals("autumn") && season.equals("fall")) {
            test = true;
        }
        else if (!(other.getSeason().equals(getSeason()))){
            test = false;
        }
        return test;
    }
}