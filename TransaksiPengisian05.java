public class TransaksiPengisian05 {
    kendaraan05 Kendaraan;
    BBM05 bbm; 
    double liter;
    double totalBayar;

    public TransaksiPengisian05(kendaraan05 Kendaraan, BBM05 bbm, double liter) { 
        this.Kendaraan = Kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    public void tampilkan() {
        totalBayar = liter * bbm.hargaPerliter;

        System.out.println(Kendaraan.platNomor + " | " + Kendaraan.tipe +
        " | " + bbm.namaBBM + " | " + liter + "L | Rp" + totalBayar);
    }
}