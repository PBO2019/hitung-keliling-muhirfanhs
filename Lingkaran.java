public class Lingkaran {
    private double phi = 3.14;
    private double Keliling;
    private int jari ;


    public void Hitunglingkaran() {
        this.Keliling = 2 * phi * jari;
    }
    public int getJari(){
        return jari;
    }
    public void setjari(int jari){
        this.jari = jari;
    }
    public double getKeliling(){
        return Keliling;
    }
}