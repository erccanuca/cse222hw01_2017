/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw01_cse222_2017;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ercan
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({LibraryStaffTest.class, LibraryUsersTest.class, RegisterTest.class, BooksTest.class, UsersTest.class, LibrarySystemAbstractTest.class, AdminTest.class, MainClassTest.class, ProcessLibrarySystemTest.class})
public class Hw01_cse222_2017Suite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
