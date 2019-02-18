/***  EE422C Project 2 (Mastermind) submission by
 *  Replace <...> with your actual data.* 
 *  <Jacob Grimm>
 *  <jag9794>*  
 *  Slip days used: <0>*  
 *  Spring 2019*/

package assignment2;
import java.util.Scanner;

public class ioclass {
	

	public void intro() {
		System.out.println("Welcome to Mastermind.");
    }

    public boolean getYorN(Scanner s){
        System.out.println("Do you want to play a new game? (Y/N): ");				
        if(s.next().charAt(0) == 'Y'){
            return true;
        }
        else{
            return false; 
        }       
    }
    
}
