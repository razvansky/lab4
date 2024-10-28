package p1;

public class calc extends Echipamente{
    private String tip_mon;
    private float vit_proc;
    private int c_hdd;
    private String windows;
    public calc(String nume, int nr_inv, float pret, String zona_inv, String stare, String tip, String tip_mon, float vit_proc, int c_hdd, String windows) {
        super(nume,nr_inv,pret,zona_inv,stare,tip);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.windows = windows;
    }

    public String getTip_mon() {
        return tip_mon;
    }
    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }
    public float getVit_proc() {
        return vit_proc;
    }
    public void setVit_proc(float vit_proc) {
        this.vit_proc = vit_proc;
    }
    public int getC_hdd() {
        return c_hdd;
    }
    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }
    public String getWindows() {
        return windows;
    }
    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public String getStare() {
        return super.getStare();
    }
    @Override
    public void setStare(String stare) {
        super.setStare(stare);
    }

    @Override
    public String toString() {
        return this.getDenumire()+";"+this.getNr_inv()+";"+this.getPret()+";"+this.getZona_mag()+";"+this.getStare()+";"+this.getTip()+";"+this.tip_mon+";"+this.vit_proc+";"+this.c_hdd+";"+this.windows;
    }

}
