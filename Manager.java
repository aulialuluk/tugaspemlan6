import java.time.LocalDate;

public class Manager extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1, 2); 
        this.jumlahAnak = jumlahAnak;
        this.departemen = departemen;
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();
        int lama = tahunSekarang - tahunMasuk.getYear();
        if (lama < 10) return gaji * 0.05;
        else if (lama <= 10) return gaji * 0.1;
        else return gaji * 0.15;
    }
    

    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20) + (0.1 * gaji);
    }

    @Override
    public String toString() {
        return "--------------------------\n" +
               "nama            : " + getNama() + "\n" +
               "nik             : " + getNik() + "\n" +
               "jenis kelamin   : " + (isJenisKelamin() ? "Laki-laki" : "Perempuan") + "\n" +
               "pendapatan      : " + getPendapatan() + "\n" +
               "tahun masuk     : " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() + "\n" +
               "jumlah anak     : " + jumlahAnak + "\n" +
               "gaji            : " + gaji + "\n" +
               "departemen      : " + departemen;
    }
}