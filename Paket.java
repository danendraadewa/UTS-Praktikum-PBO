package UTS;

public class Paket {
    protected String resi;
    protected int beratKg;
    private Kurir kurir;

    public Paket(String resi, int beratKg) {
        this.resi = resi;
        this.beratKg = beratKg;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public Kurir getKurir() {
        return kurir;
    }

    public String getResi() {
        return resi;
    }

    public int getBeratKg() {
        return beratKg;
    }

    public String getJenis() {
        return "Paket";
    }

    public int hitungOngkir() {
        return 10000 * beratKg;
    }
}
