//@ Sasikaladevi Kumarasamy

package lab13;

import java.util.Scanner;
//this is a subclass of the abstract class Player 
//which overrides the method from the parent class
public class NewPlayer extends Player{
	
	private Scanner sc;
	public NewPlayer(String name, Scanner sc) {
		super(name);
		this.sc = sc;
	}

	@Override
	public Roshambo getRoshambo() {
		String choice = Validator.getRegExString(sc, "Would you like to pick rock, paper or scissors?","rock|paper|scissors");
		if(choice.equals("rock")) {
			return Roshambo.ROCK;
		}else if(choice.equals("paper")) {
			return Roshambo.PAPER;
		}else
			return Roshambo.SCISSORS;
	}

}
