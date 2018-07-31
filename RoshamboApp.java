//@ Sasikaladevi Kumarasamy

package lab13;

import java.util.Scanner;

// This is a replication of the classic game Rock Paper Scissors
// The player can choose the opponent from the choices listed
// then the user picks either rock or paper or scissors
// depending on the choices made on each side, the results are displayed.
// wins, draws and losses are tracked each time the game starts and 
// the final result is displayed at the end of the game

public class RoshamboApp {

	public static void main(String[] args) {
		
		// define and initialize variables
		Scanner sc = new Scanner(System.in);
		String choice="y",playerName="", opponentName="";
		int userWin=0, oppWin=0, totalDraw=0;
		
		// create two variables of enum(Roshambo) type
		Roshambo playerChoice, generatedChoice=null;

		Player rockPlayer = new RockPlayer("Nemo");
		Player randomPlayer = new RandomPlayer("Dory");
		
		// display welcome message
		System.out.println("Welcome to the classic Rock Paper Scissors game!\n~~~~~~~ ~~ ~~~ ~~~~~~~ ~~~~ ~~~~~ ~~~~~~~~ ~~~~~\n");
		
		// get the user name 
		playerName = Validator.getString(sc, "Please enter your name: ");
		
		// create a variable of type NewUser for the user 
		NewPlayer newPlayer = new NewPlayer(playerName, sc);
		
		// display welcome the user
		System.out.println("Welcome "+ newPlayer.getName()+"!");
		
		// loop only when the user agrees to continue
		while(choice.equalsIgnoreCase("y")) {
			// get the opponent name and their pick 
			opponentName = Validator.getRegExString(sc, "Whom would you to play against "+rockPlayer.getName()+" or "+randomPlayer.getName()+"?(nemo/dory) : ", "nemo|dory");
			playerChoice = newPlayer.getRoshambo();
			
			// depending on the opponent choice, generate the Roshambo value
			if (opponentName.equals("nemo")) {
				generatedChoice= rockPlayer.getRoshambo();
			} else if (opponentName.equals("dory")) {
				generatedChoice = randomPlayer.getRoshambo();
			}
			
			// display the choices of user and the opponent
			System.out.println(playerName.toUpperCase()+" : "+playerChoice); 
			System.out.println(opponentName.toUpperCase()+" : "+generatedChoice); 

			// depending on the choices, make the decision of who won the game and keep track of 
			// number of wins, losses and draws
			if(playerChoice.equals(generatedChoice)) {
				totalDraw++;
				System.out.println("Its a \"Draw\"!");
			}else if(playerChoice.equals(Roshambo.ROCK)) {
				if (generatedChoice.equals(Roshambo.SCISSORS)) {
					userWin++;
					System.out.println(playerName.toUpperCase() +" wins! Rock crushes scissors!!");
				}else if(generatedChoice.equals(Roshambo.PAPER)) {
					oppWin++;
					System.out.println(opponentName.toUpperCase()+" wins! Paper eats rock!!");
				}
			}else if(playerChoice.equals(Roshambo.PAPER)) {
				if(generatedChoice.equals(Roshambo.SCISSORS)) {
					oppWin++;
					System.out.println(opponentName.toUpperCase()+" wins! Scissor cuts paper!!");
				}else if(generatedChoice.equals(Roshambo.ROCK)) {
					userWin++;
					System.out.println(playerName.toUpperCase()+" wins! Paper eats rock!!");
				}
			}else if(playerChoice.equals(Roshambo.SCISSORS)) {
				if(generatedChoice.equals(Roshambo.PAPER)) {
					userWin++;
					System.out.println(playerName.toUpperCase()+" wins! Scissor cuts paper!!");
				}else if(generatedChoice.equals(Roshambo.ROCK)) {
					oppWin++;
					System.out.println(opponentName.toUpperCase()+" wins! Rock breaks scissors!!");
				}
			}
			// check if the user wants to continue the game
			choice = Validator.getRegExString(sc, "Continue playing?(y/n) :", "y|Y|n|N");
		}
		// display final scores
		System.out.println("\nThanks for playing the classic game!!!\n");
		System.out.println("Final Scores for "+playerName.toUpperCase()+"!\n~~~~~~~~~~~~~~~~~~");
		System.out.println("Total: wins - "+userWin+"\tloss - "+oppWin+"\tdraws - "+totalDraw+" !");

		
	} // end of main method

} //  end of class
