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
public class CDCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod =  new Modelo();
        
        Vista.introducir(mod);

        claseLogica.realizaOperacion(mod);
        Vista.imprimir(mod);
    }
    
}
