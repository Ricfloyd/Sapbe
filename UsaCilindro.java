/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author lenovo 1
 */
public class UsaCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]Gargs) {
        JTextArea miArea=new JTextArea(10,25);
        JScrollPane miScroll=new JScrollPane(miArea);
        
        Cilindro unCilindro=new Cilindro(1.0,5.0);
        
        miArea.append("Dato del cilindro");
        miArea.append("\nRadio de la base: " + unCilindro.obtenerRadio());
        miArea.append("\nAltura: "+ unCilindro.obtenerAltura());
        miArea.append("\nDArea: "+ unCilindro.obtenerArea());
        miArea.append("\nVolumen: "+unCilindro.obtenerVolumen());
        
        JOptionPane.showMessageDialog(null,miScroll);
        System.exit(0);
    }
    
}
