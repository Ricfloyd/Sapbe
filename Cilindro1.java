package cilindro;

/**
 *
 * @author lenovo 1
 */
public class Cilindro1 extends Circulo {
    private double altura;
    public Cilindro1(double r, double a){
        super(r);
        altura=a;
    }
    public double obtenerAltura(){
        return altura;
    }
    public double obtenerRadio(){
        return radio;
    }
    public double obtenerArea(){
        return obtenerPerimetro()*altura+2*super.obtenerArea();
    }
    
}
