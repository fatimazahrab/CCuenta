/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

import junit.framework.TestCase;

/**
 *
 * @author aaaaa
 */
public class CCuentaTest extends TestCase {
    
    public CCuentaTest(String testName) {
        super(testName);
    }

    /**
     * Test of setNombre method, of class CCuenta.
     */
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "nom";
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CCuenta.
     */
    public void testGetNombre() {
        System.out.println("getNombre");
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        String expResult = "Manuel Mantecas";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CCuenta.
     */
    public void testGetEstado() {
        System.out.println("getEstado");
        CCuenta instance = new CCuenta();
        double expResult = 0.0;
        double result = instance.getEstado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 3000;
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        instance.ingresar(cantidad);
        double resultadoEsperado= 6000;
        double resultado=instance.getEstado();
        assertEquals(resultadoEsperado,resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testIngresarRetirar() throws Exception {
        System.out.println("ingresar y retirar");
        double cantidad = 3000;
        double cantidadRetirar=2000;
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        instance.ingresar(cantidad);
        instance.retirar(cantidadRetirar);
        double resultadoEsperado= 4000;
        double resultado=instance.getEstado();
        assertEquals(resultadoEsperado,resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of retirar method, of class CCuenta.
     */
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 200.0;
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        instance.retirar(cantidad);
        double resultadoEsperado=2800;
        double resultado=instance.getEstado();
          assertEquals(resultadoEsperado,resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class CCuenta.
     */
    public void testGetCuenta() {
        System.out.println("getCuenta");
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        String expResult = "0000-1234-55-123456789";
        String result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cobroFactura method, of class CCuenta.
     */
      public void testCobroFactura() {
        System.out.println("cobroFactura");
        String tipo = "alquiler";
        double cantidad = 300.0;
        CCuenta instance = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        instance.cobroFactura(tipo, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
