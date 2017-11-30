/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

/**
 *
 * @author lenovo 1
 */
public class Cilindro extends Circulo {
    private double altura;
    public Cilindro(double r, double a){
        super(r);
        altura=a;
    }
    public double obtenerAltura(){
        return altura;
    }
    public double obtenerArea(){
        return obtenerPerimetro()*altura+2*super.obtenerArea();
    }
    public double obtenerVolumen(){
        return super.obtenerArea()*altura;
    }


    //Esto es un Puto comentario
}
