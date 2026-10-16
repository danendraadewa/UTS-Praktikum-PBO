package UTS;

public class PaketKilat extends Paket {

    private static final int ASURANSI = 5000;

    public PaketKilat(String resi, int beratKg) {
        super(resi, beratKg);
    }

    public String getJenis() {
        return "Kilat";
    }

    public int hitungOngkir() {
        return (18000 * beratKg) + ASURANSI;
    }
}
