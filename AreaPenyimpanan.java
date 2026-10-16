package UTS;

public class AreaPenyimpanan {

    private String kode;
    private Paket[] daftarPaket = new Paket[3];
    private int jumlahPaket = 0;

    public AreaPenyimpanan(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public int getJumlahPaket() {
        return jumlahPaket;
    }

    public boolean isPenuh() {
        return jumlahPaket >= daftarPaket.length;
    }

    public boolean simpan(Paket p) {
        if (isPenuh()) {
            System.out.println("Area " + kode + " sudah penuh!");
            return false;
        }
        daftarPaket[jumlahPaket] = p;
        jumlahPaket++;
        return true;
    }

    public int totalBerat() {
        int total = 0;
        for (int i = 0; i < jumlahPaket; i++) {
            total += daftarPaket[i].getBeratKg();
        }
        return total;
    }
}
