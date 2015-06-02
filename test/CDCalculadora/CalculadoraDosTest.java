/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDCalculadora;

import static CDCalculadora.claseLogicaCheckerTest.claseLogica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FOLFO
 */
public class CalculadoraDosTest {
    
    public CalculadoraDosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of realizaOperacion method, of class CalculadoraDos.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        Modelo contenedor = new Modelo();
        contenedor.setNum1(1);
        contenedor.setNum2(4);
        contenedor.setOperacion("-");
        float expResult = -3.0F;
        float result = claseLogica.realizaOperacion(contenedor);
        assertEquals(expResult, result, 0.0);
        
    }
}
