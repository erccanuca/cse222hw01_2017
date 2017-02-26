/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw01_cse222_2017;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ercan
 */
public class LibraryUsersTest {
    
    public LibraryUsersTest() {
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
     * Test of getNumberofbooks method, of class LibraryUsers.
     */
    @org.junit.Test
    public void testGetNumberofbooks() {
        System.out.println("getNumberofbooks");
        LibraryUsers instance = new LibraryUsers(0, "", "", "", "", "");
        ArrayList<Books> expResult = new ArrayList<>();
        ArrayList<Books> result = instance.getNumberofbooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberofbooks method, of class LibraryUsers.
     */
    @org.junit.Test
    public void testSetNumberofbooks() {
        System.out.println("setNumberofbooks");
        ArrayList<Books> numberofbooks = new ArrayList<>();
        LibraryUsers instance = new LibraryUsers(0, "", "", "", "", "");
        instance.setNumberofbooks(numberofbooks);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of barrowBook method, of class LibraryUsers.
     */
    @org.junit.Test
    public void testBarrowBook() throws Exception {
        System.out.println("barrowBook");
        Books obj = new Books("", "", "", 0);
        LibraryUsers instance = new LibraryUsers(0, "", "", "", "", "");
        boolean expResult = true;
        boolean result = instance.barrowBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class LibraryUsers.
     */
    @org.junit.Test
    public void testReturnBook() throws Exception {
        System.out.println("returnBook");
        Books obj = new Books("", "", "", 0);;
        LibraryUsers instance = new LibraryUsers(0, "", "", "", "", "");
        boolean expResult = false;
        boolean result = instance.returnBook(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LibraryUsers.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        LibraryUsers instance = new LibraryUsers(0, "", "", "", "", "");;
        String expResult = "LibraryUsers{Register{Users{\n" +
        "	userID=0, name=, surname=, email=}\n" +
        "	username=, password=} numberofbooks=[]}";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
