public class Lingkaran {
    public double phi = 3.14;
    public double Keliling;

    public void Hitunglingkaran(int jari2) {
        Keliling = 2*phi*jari2;
        System.out.println("Keliling Lingkaran " + jari2 + " Adalah " + Keliling);
    }
}