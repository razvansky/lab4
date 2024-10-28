package p1;

public class Copiator extends Echipamente{
    private int p_ton;
    private String format;
    public Copiator(String nume, int nr_inv, float pret, String zona_inv, String stare, String tip, int p_ton, String format) {
        super(nume,nr_inv,pret,zona_inv,stare,tip);
        this.p_ton = p_ton;
        this.format = format;

    }

    public int getP_ton() {
        return p_ton;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
        return this.getDenumire()+";"+this.getNr_inv()+";"+this.getPret()+";"+this.getZona_mag()+";"+this.getStare()+";"+this.getTip()+";"+this.p_ton+";"+this.format;
    }

}
