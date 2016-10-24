
/**
 * The Duck class.
 * 
 * It Inherits from Animal Class.
 */
public class Duck extends Animal{

	Duck(String _name, String _color) {
		super(_name, _color);
	}
	
	/**
     * A duck can quack, while other animals mighn't.
     * 
     */
	public void quack(){
		System.out.println("The duck with the name " + this.name + " is quacking.");
	}
	
	/**
     * This is an overridden version of the method in the parent class.
     * 
     */
	public void display(){
		System.out.println("My name is " + this.name 
				+ " and color " + this.color + ". I feed on grasses, plants, fish, and small insects.");
	}
}
