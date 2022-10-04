/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttestejunit;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 *
 * @author jairb
 */
public class NumerosTest {

    private Numeros n;

    public NumerosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        n = new Numeros();
    }

    @After
    public void tearDown() throws Exception {
    }

 
    /**
     * Test of numeroPar method, of class Numeros.
     */
    @Test
    public void testNumeroPar() {
        System.out.println("numeroPar");
        assertEquals(true, n.numeroPar(8));
    }

    /**
     * Test of areQ method, of class Numeros.
     */
    @Test
    public void testAreQ() {
        System.out.println("areQ");
        assertEquals(100, n.areQ(10));
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @Test
    public void testNumeroDivisivel() {
        System.out.println("numeroDivisivel");
        assertTrue(n.numeroDivisivel(4, 2));
    }

    /**
     * Test of somaValores method, of class Numeros.
     */
    @Test
    public void testSomaValores() {
        System.out.println("somaValores");
        assertEquals(4, n.somaValores(2, 2));
    }

}
