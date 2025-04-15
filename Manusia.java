public class Manusia {
    protected String nama;
    protected String nik;
    protected boolean jenisKelamin; 
    protected boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }


    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        String gender = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "--------------------------\n" +
               "nama            : " + nama + "\n" +
               "nik             : " + nik + "\n" +
               "jenis kelamin   : " + gender + "\n" +
               "pendapatan      : " + getPendapatan();
    }
}
