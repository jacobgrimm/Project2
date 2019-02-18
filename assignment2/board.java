/***  EE422C Project 2 (Mastermind) submission by
  *   Replace <...> with your actual data.
  *   *  <Jacob Grimm>*
  *     <jag9794>*  
  *     Slip days used: <0>
  *     *  Spring 2019*/


package assignment2;

import java.util.ArrayList;
public class board{
    private String password;
    private int blackPins;
    private int whitePins;
    private ArrayList<String> guessHistory; 

    public board(String x){
        password = x;
        blackPins = 0;
        whitePins =  0; 
        guessHistory = new ArrayList<String>();
    }


    public boolean check_guess (String guess){
        if (password.equals(guess)){
		System.out.println(guess+ " -> 4b_0w");
            return true;
        }
        char [] temp = password.toCharArray();
        char [] s = guess.toCharArray(); 
        int length = password.length();
        blackPins = 0;
        whitePins =  0; 
            for(int i=0; i< length; i++){
                if(s[i]==temp[i]){
                    blackPins++;
                    s[i]=0;
                    temp[i]=0;                    ;                   
                }
            }
            for(int i=0; i < length; i++){
                for(int j=0; j<length && s[i] !=0; j++ ){
                    if(s[i]==temp[j]){
                        whitePins++;
                        s[i]=0;
                        temp[j]=0;
                    }
                }                
            }
            String histor = guess + " -> " + blackPins + "b_" + whitePins + "w";
            System.out.println(histor);
            guessHistory.add(histor);
            
            return false;


    }

   /* private void printArr(char [] s){
        for(int i=0; i<s.length;i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }
    */
    public void getHistory(){
    	for(String i:guessHistory) {
    		System.out.println(i);   		    		
    	}

    }

      




}