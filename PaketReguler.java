package UTS;

public class PaketReguler extends Paket {

    public PaketReguler(String resi, int beratKg) {
        super(resi, beratKg);
    }

    public String getJenis() {
        return "Reguler";
    }

    public int hitungOngkir() {
        int ongkir = 10000 * beratKg;
        return Math.max(ongkir, 15000);
    }
}
