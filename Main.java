public class Main {

    public static void main(String[] args) {
        System.out.println("Menhitung Keliling Bujur Sangkar dan Lingkaran");
        System.out.println();
        Bujursangkar bujursangkar = new Bujursangkar();
        Lingkaran lingkaran = new Lingkaran();

        lingkaran.setjari(5);
        lingkaran.Hitunglingkaran();
        System.out.println("jari-jarinya = " + lingkaran.getJari());
        System.out.println("Keliling Lingkarannya Adalah "+ lingkaran.getKeliling() + " cm");
        System.out.println();

        bujursangkar.setsisi(10);
        bujursangkar.HitungBujursangkar();
        System.out.println("Sisinya = " + bujursangkar.getSisi());
        System.out.println("Keliling Bujur Sangkar Adalah "+ bujursangkar.getkeliling() +" cm");
    }
}

