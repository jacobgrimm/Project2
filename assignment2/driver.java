/**
 * EE422C Project 2 (Mastermind) submission by
 * Replace <...> with your actual data. 
 * <Jacob Grimm>
 * <jag9794>
 * Slip days used: <0>
 * Spring 2019
 */
package assignment2;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		String passcode = SecretCodeGenerator.getInstance().getNewSecretCode();
		if( args.length !=0 && args[0].equals("1")) {
			System.out.println(passcode);
		}
		Scanner inputMonster = new Scanner(System.in);
		ioclass input = new ioclass();
		input.intro();
		while(input.getYorN(inputMonster)){
		Game game = new Game(inputMonster, passcode);
		game.runGame();
		passcode = SecretCodeGenerator.getInstance().getNewSecretCode();
		}

		
		
				
	}
	

	
	
	
	
}