/***  EE422C Project 2 (Mastermind) submission by
 * *  Replace <...> with your actual data.
 * *  <Jacob Grimm>
 * *  <jag9794>
 * *  Slip days used: <0>
 * *  Spring 2019*/
package assignment2;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Game {
    private Scanner s;
    private String guess;
    private String code;
    private List<String> allowedColors;
    private board b;
    int turns;

    public Game(Scanner card, String name){
        s=card;
        b= new board(name);
        code = name;
        guess = null;
        turns = GameConfiguration.guessNumber;
        allowedColors= Arrays.asList((GameConfiguration.colors));       
    }

    public void runGame(){
        for(int i=turns; i> 0; i--){
            prompt(i);
            while(!isValid()){
                if(guess.equals("HISTORY")){
                    b.getHistory();
                    prompt(i);
                }
                else{
                     System.out.println("INVALID_GUESS");
                    prompt(i);
                }
            }
            boolean cheque = b.check_guess(guess);
            if(cheque){
                System.out.println("You win!");
                System.out.println();
                return;                
            }
        }
        System.out.println("You lose! The pattern was " + code);    
        System.out.println();
    

    }


    

    private boolean isValid (){
        if(guess.length() != code.length()){
            return false;
        }

        for(int i=0; i< guess.length(); i++){
            if(!allowedColors.contains(String.valueOf(guess.charAt(i)))){
                return false;
            }
            
        }       
        return true;


    }

    private void prompt(int i){
        System.out.println();
        System.out.println("You have " + i +  " guess(es) left.");
        System.out.println("Enter guess: ");
         guess = s.next();
    }

}
