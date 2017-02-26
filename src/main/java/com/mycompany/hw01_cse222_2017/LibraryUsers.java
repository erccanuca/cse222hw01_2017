/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw01_cse222_2017;

import java.util.ArrayList;

/**
 * This class is that, content of library users informations.
 * @author ercan
 */
public class LibraryUsers extends LibrarySystemAbstract{
  
    /**
     * Number of books are library user own books.
     */
    private ArrayList<Books> numberofbooks = new ArrayList();

    
    /**
     * 6 parameter constructor.
     * @param userID The ID of user.
     * @param username username of user.
     * @param password password of user.
     * @param name The name of user.
     * @param surname The surname of user.
     * @param email The email of user.
     */
    public LibraryUsers(int userID, String username, String password, String name, String surname, String email) {
        super(userID, username, password, name, surname, email);
    }
   
    /**
     * Getter number of books.
     * @return number of books.
     */
    public ArrayList<Books> getNumberofbooks() {
        return numberofbooks;
    }
    /**
     * Setter number of books.
     * @param numberofbooks set new number of books.
     */
    public void setNumberofbooks(ArrayList<Books> numberofbooks) {
        this.numberofbooks = numberofbooks;
    }
    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if added book correctly.
     * throws NullPointerException
     */
    @Override
    public boolean barrowBook(Books obj) throws NullPointerException{
        if(obj == null)
            throw new NullPointerException();
        return numberofbooks.add(obj);
    }
    /**
     * Can use library user or library staff
     * @param obj Type of Books Class
     * @return true if removed book correctly and added library.
     * throws NullPointerException.
     */
    @Override
    public boolean returnBook(Books obj)throws NullPointerException{
       if(obj == null)
            throw new NullPointerException();
        return numberofbooks.remove(obj);
    }
    /**
     * ToString method.
     * @return information about this class. 
     */
    @Override
    public String toString() {
        return "LibraryUsers{"+super.toString()+ " numberofbooks=" + numberofbooks + '}';
    }
   
}
