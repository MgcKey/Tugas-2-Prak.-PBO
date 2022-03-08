import java.util.Scanner;

public class Main {

    static int pilihan,jawaban;
    static double panjang, lebar, tinggi, jari2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("+------------+");
            System.out.println("| MENU UTAMA |");
            System.out.println("+------------+");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    System.out.print("Input panjang : ");
                    panjang = input.nextDouble();
                    System.out.print("Input lebar : ");
                    lebar = input.nextDouble();
                    System.out.print("Input tinggi : ");
                    tinggi = input.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar,tinggi);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    System.out.println("Luas persegi panjang : " + persegiPanjang.luas() );
                    System.out.println("Keliling persegi panjang : " + persegiPanjang.keliling());
                    System.out.println("Volume balok : " + balok.volume());
                    System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
                    break;
                case 2 :
                    System.out.print("Input jari-jari : ");
                    jari2 = input.nextDouble();
                    System.out.print("Input tinggi : ");
                    tinggi = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jari2,tinggi);
                    Tabung tabung = new Tabung(jari2,tinggi);
                    System.out.println("Luas lingkaran : " + lingkaran.luas() );
                    System.out.println("Keliling lingkaran : " + lingkaran.keliling());
                    System.out.println("Volume tabung : " + tabung.volume());
                    System.out.println("Luas permukaan tabung : " + tabung.luasPermukaan());
                    break;
                case 3 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan tidak tersedia. Mohon masukkan pilihan dengan benar!");
            }
            System.out.print("Ulangi ? (Ya = 1 || Tidak = 0) : ");
            jawaban = input.nextInt();
            if(jawaban==0){
                System.exit(jawaban);
            }
        }while(jawaban==1);
    }
    
}
