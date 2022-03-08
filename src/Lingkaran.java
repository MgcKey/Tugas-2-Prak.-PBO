
public class Lingkaran  extends Tabung implements MenghitungBidang{
    
    public Lingkaran(double jari2, double tinggi){
        super(jari2,tinggi);
    }
    
    @Override
    public double luas(){
        return phi * jari2 * jari2;
    }
    
    @Override
    public double keliling(){
        return 2 * phi * jari2;
    }
}
