/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg11;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tiempo obj= new Tiempo();
       
       long  por, time_end;
        
       
       obj.mensaje();
       por= System.currentTimeMillis();
       obj.escribir();
       JOptionPane.showMessageDialog(null,"Preme enter para rematar");
       time_end= System.currentTimeMillis();
       JOptionPane.showMessageDialog(null, "Tardaches "+((time_end - por)/1000)+ " Segundos en escribir a frase" );
    }
    
}
