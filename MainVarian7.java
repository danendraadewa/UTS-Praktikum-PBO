package UTS;

public class MainVarian7 {
    public static void main(String[] args) {

        Pegawai kepala = new Pegawai("NIP001", "Pak Bowo");
        Kurir eko      = new Kurir("Eko", "Motor");

        Gudang gudang = new Gudang("Hub Malang", 2);
        gudang.setKepala(kepala);

        PaketReguler r1 = new PaketReguler("PKT-001", 3);
        r1.setKurir(eko);

        PaketReguler r2 = new PaketReguler("PKT-002", 1);

        PaketKilat k1 = new PaketKilat("PKT-003", 2);
        k1.setKurir(eko);

        gudang.simpan(r1);
        gudang.simpan(r2);
        gudang.simpan(k1, 2);

        LabelPrinter printer = new LabelPrinter("Zebra ZD421");
        printer.cetakLabel(r1);
        printer.cetakLabel(r2);
        printer.cetakLabel(k1);

        System.out.println();
        gudang.tampilInfo();

        Paket p = new PaketKilat("PKT-009", 5);
        System.out.println("\nPolimorfisme: " + p.hitungOngkir());
    }
}
