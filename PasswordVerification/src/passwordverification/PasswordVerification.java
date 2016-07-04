/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package passwordverification;

import java.util.Scanner;

/**
 *
 * @author Desktop
 */
public class PasswordVerification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get user input
        Scanner in = new Scanner (System.in);
        System.out.println("Password must: ");
        System.out.println("- be at least 8 characters long");
        System.out.println("- have at least 1 upper and 1 lowercase letter");
        System.out.println("- have at least one digit");
        
        System.out.print("\nEnter Password: ");
        String passwordOne = in.next();
        
        System.out.print("RE-Enter password: ");
        String passwordTwo = in.next();
        
        //check if passwords match
        while(!passwordMatch(passwordOne, passwordTwo) || !criteriaCheck(passwordOne)){
            System.out.println("\nError - passwords don't meet requirements.");
            System.out.print("Enter Password: ");
            passwordOne = in.next();
        
            System.out.print("RE-Enter password: ");
            passwordTwo = in.next(); 
        } 
        System.out.println("-- Password meets requirements");
    }
    public static boolean passwordMatch(String pwOne, String pwTwo){
        return(pwOne.equals(pwTwo));
    }
    
    public static boolean criteriaCheck(String pw){
        //check if password meets requirements
        return (pw.length() > 7 && upperCheck(pw) && lowerCheck(pw) && digitCheck(pw));
    }
    
    public static boolean upperCheck(String pw){
        for (char c : pw.toCharArray()) {
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
    public static boolean lowerCheck(String pw){
        for (char c : pw.toCharArray()) {
            if(Character.isLowerCase(c)){
                return true;
            } 
        }
        return false;
    }
    public static boolean digitCheck(String pw){
        for (char c : pw.toCharArray()) {
            if(Character.isDigit(c)){
                return true;
            } 
        }
        return false;
    }
}

