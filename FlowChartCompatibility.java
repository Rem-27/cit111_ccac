/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendship;
import java.util.Scanner;

/** Program asks users a series of questions about their interests
 * and computes an overall friend compatiablity score based on
 * their response
 * @author Rashelle
 */
public class FlowChartCompatibility {
    public static void main(String [] unneeded){
        //creat storage containers (variable)
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 45;
        int userResponse = 1;
        Scanner inputScanner = new Scanner(System.in);
        boolean passedThreshold = false; //not used in v.o
        
        //Fixed points allotments by question
        final int Q1_YES_POINTS = 10;
        final int Q1_NO_POINTS = -5;
        
        
        
        //create scanner
        inputScanner = new Scanner(System.in);
        
        System.out.println("Hi, My name is Rashelle, let's see if we"
                + "could be great friends.");
        System.out.println("Please answer the following questions truthfully.");
//*************************************************************
//QUESTION 1: Summer
//*************************************************************
        System.out.println("Q1: Do you enjoy the summer? "
                + "If yes type 1, If no type 2");
        //use scanner to read the answer
        userResponse = inputScanner.nextInt();
        if (userResponse == 1){
            compatScore = compatScore + 10;    
            System.out.println("Great! Me too.");
            
//*************************************************************
//QUESTION 2: Sport
//*************************************************************
            System.out.println("Q2: Do you like playing sports?"
                    + " If yes type 1, If no type 2");
            userResponse = inputScanner.nextInt();
                if(userResponse == 1){
                compatScore = compatScore + 50;
//*************************************************************
//QUESTION 3: Which Sport
//*************************************************************                
                System.out.println("Q3: Which Sport do you play?"
                        + " Type the number and enter.");
                System.out.println("1. Soccer");
                System.out.println("2. Basketball");
                System.out.println("3. Volleyball");
                System.out.println("4. Football");
                System.out.println("5.Other");
                userResponse = inputScanner.nextInt();
                if(userResponse ==1){
                    compatScore = compatScore + 30;
                    
                }else if (userResponse == 2){
                    //Basketball
                    compatScore = compatScore + 20;
                }else if (userResponse == 3){
                    //Volleyball
                    compatScore = compatScore + 20;
                    
                }else if (userResponse == 4){
                    //Football
                    compatScore = compatScore + 10;
                }else if (userResponse == 5){
                    //Other
                    compatScore = compatScore + 5;
                }//end if chain for sport
                
                


           } else{
            compatScore = compatScore + Q1_NO_POINTS;
                System.out.println("Oh No!"
                + "I love sports.");
        }
      
                    
        } else{ //block runs if user enter not 1 for Q1
       compatScore = compatScore + Q1_NO_POINTS;
                System.out.println("Oh No!"
                + "I really enjoy the summer.");
        }
       
      //logic will run regardless of previous question's answer
            System.out.println("Checking Compatablity...");
            if(compatScore >= COMPAT_THRESHOLD){
                passedThreshold = true;
                System.out.println("Excellent, lets be friends!");
                
            }else{
                System.out.println("We have a low compatability, Sorry.");
            }//close if else for overall checking
            System.out.println("Thanks! for trying the friendship robot!");
            
    }
}
