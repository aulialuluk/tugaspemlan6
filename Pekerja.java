import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int tahunMasuk, int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 3, 2); 
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();
        int lama = tahunSekarang - tahunMasuk.getYear();
        if (lama < 10) return gaji * 0.05;
        else if (lama <= 10) return gaji * 0.1;
        else return gaji * 0.15;
    }
    

    @Override
    public double getPendapatan() {
       return super.getTunjangan() + getBonus() + (jumlahAnak * 20) + gaji ;
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
               "gaji            : " + gaji;
    }
}