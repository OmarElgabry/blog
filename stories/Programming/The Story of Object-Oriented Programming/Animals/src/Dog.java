
/**
 * The Dog class.
 * 
 * It Inherits from Animal Class.
 */
public class Dog extends Animal{
		
	Dog(String _name, String _color) {
		super(_name, _color);
	}
	
	/**
     * A dog can run, while other animals mighn't.
     * 
     */
	public void run(){
		System.out.println("The dog with the name " + this.name + " is running.");
	}
}
