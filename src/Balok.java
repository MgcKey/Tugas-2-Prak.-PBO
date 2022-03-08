
public class Balok implements MenghitungRuang{
    double panjang, lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return panjang * lebar * tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
}
