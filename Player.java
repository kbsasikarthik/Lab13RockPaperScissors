//@ Sasikaladevi Kumarasamy

package lab13;

// parent class which is abstract
public abstract class Player {
	private String name ;
	
	// constructor with one parameter
	public Player(String name) {
		this.name = name;
	}
	
	// getter for the class variable
	public String getName() {
		return name;
	}
	
	// abstract method of this class
	public abstract Roshambo getRoshambo();
	
	@Override
	public String toString() {
		return "Player - "+name;
		
	}

	

}
