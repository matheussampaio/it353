/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iltu.itk353.lab2.msanto2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author BillyLim
 */
public class CheckValidatorJUnitTest {

    public CheckValidatorJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCheckNumberLength() {
        // assertEquals asserts that the two args have equal value
        // Since the check num is not 10-digit long, should return true (i.e. counterfeit)
        assertEquals(true, CheckValidator.isCounterfeit("123"));
    }

    @Test
    public void test2Zeros3NonZeros() {
        // 10 digits (boundary condition), no 3 or more consecutive 0's nor 4 or more consecutive non-0's. Thus, not counterfeit
        // This number also tests the boundary conditions for 2 consecutive zeros (OK) and three consecutive non-0's (OK)
        assertEquals(false, CheckValidator.isCounterfeit("1230012300"));
    }

    @Test
    public void test11Digits() {
        // 11 digits (boundary condition). Thus, counterfeit
        assertEquals(true, CheckValidator.isCounterfeit("12300123001"));
    }

    @Test
    public void test3Zeros() {
        // 10 digits, 3 or more consecutive 0's. Thus, counterfeit
        assertEquals(true, CheckValidator.isCounterfeit("1230001234"));
    }

    @Test
    public void test4NonZeros() {
        // 10 digits, 4 or more consecutive non-0's. Thus, counterfeit
        assertEquals(true, CheckValidator.isCounterfeit("1230012340"));
    }

    @Test
    public void testNonDigit() {
        // 10 chars, non-digit. Thus, counterfeit
        assertEquals(true, CheckValidator.isCounterfeit("abc00abc00"));
    }
}
