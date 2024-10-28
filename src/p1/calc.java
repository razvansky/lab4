package p1;

import p1.Echipamente;

public class Imprimanta extends Echipamente{
    private int ppm;
    private String rez;
    private int p_car;
    private boolean color;
    public Imprimanta(String nume, int nr_inv, float pret,String zona_inv,String stare,String tip,int ppm,String rez, int p_car,boolean color) {
        super(nume,nr_inv,pret,zona_inv,stare,tip);
        this.ppm = ppm;
        this.rez = rez;
        this.p_car = p_car;
        this.color = color;
    }

    public int getPpm() {
        return ppm;
    }
    public void setPpm(int ppm) {
        this.ppm = ppm;
    }
    public String getRez() {
        return rez;
    }
    public void setRez(String rez) {
        this.rez = rez;
    }
    public int getP_car() {
        return p_car;
    }
    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public boolean isColor() {
        return color;
    }
    public void setColor(boolean color) {
        this.color = color;
    }
}
