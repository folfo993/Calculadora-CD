/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Vista {
    public static void imprimir(Modelo mod){
        JOptionPane.showMessageDialog(null,mod.getResultado() );
    }
    
    
    /**
     * Metodo para introducir Num1, Num2, Operacion
     * @param mod objeto 
     */
    public static void introducir(Modelo mod){
        mod.setNum1(Float.valueOf(JOptionPane.showInputDialog(null, "Introduzca primer numero")));
        mod.setNum2(Float.valueOf(JOptionPane.showInputDialog(null, "Introduzca segundo numero")));
        mod.setOperacion(JOptionPane.showInputDialog(null, "introduzca operacion"));
    }
}
