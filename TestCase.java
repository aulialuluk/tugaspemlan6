import java.time.LocalDate;

public class TestCase {
    public static void main(String[] args) {
       Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

       MahasiswaFILKOM b = new MahasiswaFILKOM("16515030111100", 4.0, "B", "111", false, false);
        System.out.println(b);

       Pekerja c = new Pekerja("C", "111", true, true, 1000, 2016, 4);
        System.out.println(c);

        Manager d = new Manager("D", "111", true, true, 1000, 2017, 3, "HRD");
        System.out.println(d);
    }
}