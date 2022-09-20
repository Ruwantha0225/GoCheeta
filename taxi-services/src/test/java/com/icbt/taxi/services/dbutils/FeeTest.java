/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.icbt.taxi.services.dbutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NOBODY
 */
public class FeeTest {
    
    public FeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateFee method, of class Fee.
     */
    @Test
    public void testCalculateFee() {
        System.out.println("calculateFee");
        int distance = 5;
        int price = 100;
        Fee instance = new Fee();
        int expResult = 500;
        int result = instance.calculateFee(distance, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testCalculateFeeagain() {
        System.out.println("calculateFee");
        int distance = 100;
        int price = 100;
        Fee instance = new Fee();
        int expResult = 10000;
        int result = instance.calculateFee(distance, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
