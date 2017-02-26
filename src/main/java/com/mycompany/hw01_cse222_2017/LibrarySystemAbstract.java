/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw01_cse222_2017;

import java.util.ArrayList;

/**
 * My system class
 * @author ercan
 */

public abstract class LibrarySystemAbstract extends Register implements ProcessLibrarySystem{

    protected ArrayList<Users> users = new ArrayList();
    protected ArrayList<LibraryUsers> library_users = new ArrayList();
    protected ArrayList<Books> library_books = new ArrayList();
   
    /**
     * Default Constructor
     */
    public LibrarySystemAbstract() {
        super();
    }
    /**
     * 6 parameters constructor.
     * @param userID user id.
     * @param username username of user.
     * @param password password of user.
     * @param name name of user.
     * @param surname surname of user.
     * @param email email of user.
     */
    public LibrarySystemAbstract(int userID,String username, String password, String name, String surname, String email) {
        super(userID, username, password, name, surname, email);
    }
   
    /**
     * Getter users array list
     * @return array list users
     */ 
    public ArrayList<Users> getUsers() {
        return users;
    }
    /**
     * Setter users array list
     * @param users set new array list users
     */
    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }
    /**
     * Getter library user array list
     * @return library user array list
     */
    public ArrayList<LibraryUsers> getLibrary_users() {
        return library_users;
    }
    /**
     * Setter library_users array list
     * @param library_users set new library_users array list
     */
    public void setLibrary_users(ArrayList<LibraryUsers> library_users) {
        this.library_users = library_users;
    }
    /**
     * Getter books array list
     * @return books array list
     */
    public ArrayList<Books> getBooks() {
        return library_books;
    }
    /**
     * Setter library books array list
     * @param library_books set new library books array list
     */
    public void setBooks(ArrayList<Books> library_books) {
        this.library_books = library_books;
    }
    /**
     * View all books, added by library staff.
     */
    @Override
    public void viewBooks(){
        for(int i=0; i < library_books.size(); ++i){
            System.out.print(library_books.toString());
        }
    }
    /**
      * Log in for Users
      * @param obj Register Class object
      * @return true if right username and password, otherwise throw exception
      * throws SecurityException
      */
    @Override
    public boolean logIn(Register obj)throws SecurityException{
        return super.logIn(obj);
    }
     /**
     * Log out for Users
     * @param obj Register Class object
     * @return true if username and password are right
     * throws SecurityException
     */
    @Override
    public boolean logOut(Register obj)throws SecurityException{
        return super.logOut(obj);
    }
    /**
     * View information about this class
     * @return information about this class
     */
    @Override
    public String toString() {
        return super.toString();
    }

   
    
}
