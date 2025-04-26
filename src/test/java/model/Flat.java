package model;

public class Flat {
    private int nr;
    private boolean lightOn;

    public Flat(int flatNr){
        nr = flatNr;
        lightOn = false;
    }

    //--------------------Getters/Setters-------------------------------
    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public boolean isLightOn() {
        return lightOn;
    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }
}
