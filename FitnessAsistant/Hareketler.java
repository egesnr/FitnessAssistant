package FitnessAsistant;

public abstract class Hareketler {
     private int Running;
     private int Bycycle;
    private int Rowing;
    private int Benchpress;
    private int BarbellCurl;
    private int BarbellRow;
    private int Squat;
    private int Pullup;
    private int Pushup;

    public Hareketler() {
    }

    public int getRunning() {
        return Running;
    }

    public void setRunning(int running) {
        Running = running;
    }

    public int getBycycle() {
        return Bycycle;
    }

    public void setBycycle(int bycycle) {
        Bycycle = bycycle;
    }

    public int getRowing() {
        return Rowing;
    }

    public void setRowing(int rowing) {
        Rowing = rowing;
    }

    public int getBenchpress() {
        return Benchpress;
    }

    public void setBenchpress(int benchpress) {
        Benchpress = benchpress;
    }

    public int getBarbellCurl() {
        return BarbellCurl;
    }

    public void setBarbellCurl(int barbellCurl) {
        BarbellCurl = barbellCurl;
    }

    public int getBarbellRow() {
        return BarbellRow;
    }

    public void setBarbellRow(int barbellRow) {
        BarbellRow = barbellRow;
    }

    public int getSquat() {
        return Squat;
    }

    public void setSquat(int squat) {
        Squat = squat;
    }

    public int getPullup() {
        return Pullup;
    }

    public void setPullup(int pullup) {
        Pullup = pullup;
    }

    public int getPushup() {
        return Pushup;
    }

    public void setPushup(int pushup) {
        Pushup = pushup;
    }
}
