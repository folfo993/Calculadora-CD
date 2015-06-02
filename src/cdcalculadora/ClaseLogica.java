/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcalculadora;

/**
 *
 * @author FOLFO
 */
public class ClaseLogica {
    public static float realizaOperacion(Modelo contenedor){
        
        float resultado = 0;
        
        switch(contenedor.getOperacion()){
            case "+": 
                 resultado = contenedor.getNum1()+contenedor.getNum2();
            break;
            case "-": 
                 resultado = contenedor.getNum1()-contenedor.getNum2();
            break;
            case "*": 
                 resultado = contenedor.getNum1()*contenedor.getNum2();
            break;
            case "/": 
                 resultado = contenedor.getNum1()/contenedor.getNum2();
            break;
        }
        contenedor.setResultado(resultado);
        
        return resultado;
    }
}
