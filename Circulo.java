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
public class Circulo {
    double radio;
    public Circulo(double r){
        radio=r;
    }
    public double obtenerRadio(){
        return radio;
    }
    public double obtenerArea(){
     return Math.PI*radio*radio;
    }
    public double obtenerPerimetro(){
        return 2*Math.PI*radio;
    }
}
