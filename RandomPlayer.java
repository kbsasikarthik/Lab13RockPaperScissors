//@ Sasikaladevi Kumarasamy
package lab13;
// this is a subclass of the abstract class Player 
// which overrides the method from the parent class
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo getRoshambo() {
		int randomNumber = (int)(Math.random()*3+1);
		switch(randomNumber) {
			case 1:
				return Roshambo.ROCK;
			case 2:
				return Roshambo.PAPER;
			case 3:
				return Roshambo.SCISSORS;
			default:
				return null;
		}
	}

}
