//@ Sasikaladevi Kumarasamy

package lab13;

public class RockPlayer extends Player {
	
	public RockPlayer(String name) {
		super(name);
	}
	
	
	@Override
	public Roshambo getRoshambo() {
		return Roshambo.ROCK;
	}

}
