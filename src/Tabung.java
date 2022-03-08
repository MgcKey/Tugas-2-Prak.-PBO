
public class Tabung implements MenghitungRuang{
    final double phi = 3.14;
    double jari2;
    private double tinggi;

    public Tabung(double jari2, double tinggi) {
        this.jari2 = jari2;
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
        return phi * jari2 * jari2 * tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2 * phi * jari2 * tinggi + 2 * phi * jari2 * jari2;
    }
    
}
