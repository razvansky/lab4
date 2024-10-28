package p1;

import java.time.LocalDate;

public class Echipamente {
    private String denumire;
    private int nr_inv;
    private float pret;
    private String zona_mag;
    private String stare;
    private String tip;
    public Echipamente(String denumire, int nr_inv, float pret, String zona_mag,String stare,String tip) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stare = stare;
        this.tip = tip;
    }

    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public int getNr_inv() {
        return nr_inv;
    }
    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }
    public float getPret() {
        return pret;
    }
    public void setPret(float pret) {
        this.pret = pret;
    }
    public String getZona_mag() {
        return zona_mag;
    }
    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public String getTip()
    {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return this.denumire+";"+this.nr_inv+";"+this.pret+";"+this.zona_mag+";"+this.stare+";"+this.tip;
    }
}


