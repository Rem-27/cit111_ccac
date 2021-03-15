package week5;

/**
 *
 * @author Rashelle
 */



//import scanner

import java.util.Scanner;



public class Authentication {
    // password key for the password
    private final static String PASSWORD = "rem" ;
    //create another key to store the secret info
    private final static String SECRET = 
            "this is to test how many people know my password";
    //create int to show how many as attempts are available
    private final static int NUM_ATTEMPTS = 3;
    
   
    
    //now for the method in which code is written
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //welcome
        System.out.println("Welcome User");
        System.out.println("Authentication Required");
        System.out.println("Enter Password To Continue To Information");
        
        
        //scanner required to read user input
        Scanner scanner = new Scanner(System.in);
        
        //variable for the num of attempts to be stored
        int attempts = 0;
        
            while(attempts < NUM_ATTEMPTS ){
                String userPassword = scanner.next();
                    if (userPassword.equals(PASSWORD)){
                        System.out.println("CORRECT");
                        System.out.println("The information you require: " + SECRET);
                        System.out.println("************************************");
                        //exit out of loop with statement "break"
                        break;
                        
                        //if wrong
                        
                    }else {
                        //let user know it is wrong
                        System.out.println("Incorrect Password");
                        System.out.println("Try Again");
                        //track attempt
                        attempts = attempts + 1;
                        //let them know of the decrease in attempts
                        System.out.println("Number of attempts " + attempts);
                        System.out.println("Attemps allowed " + NUM_ATTEMPTS);
                        
                        if (attempts == NUM_ATTEMPTS){
                            // too many tries
                            System.out.println("Too Many Attempts");
                            System.out.println("Goodbye");
                            
                            //they may want to try again
                       
                        }else { System.out.println("Would You Like To Try Again?");
                    }
                }
        
                   
    }
}
}