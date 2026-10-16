package UTS;

public class LabelPrinter {

    private String model;

    public LabelPrinter(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void cetakLabel(Paket p) {
        String info = "[" + p.getJenis() + "] " + p.getResi() + " | " + p.getBeratKg() + " kg | ";
        if (p.getKurir() != null) {
            info += "Kurir: " + p.getKurir().getNama() + " | ";
        }
        info += "Ongkir: " + p.hitungOngkir();
        System.out.println(info);
    }
}
