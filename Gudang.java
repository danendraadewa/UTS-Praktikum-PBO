package UTS;

public class Gudang {

    private String nama;
    private AreaPenyimpanan[] daftarArea;
    private Pegawai kepala;

    public Gudang(String nama, int jumlahArea) {
        this.nama = nama;
        this.daftarArea = new AreaPenyimpanan[jumlahArea];
        for (int i = 0; i < jumlahArea; i++) {
            daftarArea[i] = new AreaPenyimpanan("A-" + (i + 1));
        }
    }

    public void setKepala(Pegawai pegawai) {
        this.kepala = pegawai;
    }

    public String getNama() {
        return nama;
    }

    public Pegawai getKepala() {
        return kepala;
    }

    public boolean simpan(Paket p) {
        for (AreaPenyimpanan area : daftarArea) {
            if (!area.isPenuh()) {
                return area.simpan(p);
            }
        }
        System.out.println("Semua area penuh! Paket " + p.getResi() + " tidak dapat disimpan.");
        return false;
    }

    public boolean simpan(Paket p, int nomorArea) {
        int index = nomorArea - 1;
        if (index < 0 || index >= daftarArea.length) {
            System.out.println("Nomor area " + nomorArea + " tidak valid!");
            return false;
        }
        return daftarArea[index].simpan(p);
    }

    public void tampilInfo() {
        System.out.println("Gudang " + nama + " (Kepala: " + (kepala != null ? kepala.getNama() : "-") + ")");
        for (AreaPenyimpanan area : daftarArea) {
            System.out.println(area.getKode() + ": " + area.getJumlahPaket() + " paket, " + area.totalBerat() + " kg");
        }
    }
}
