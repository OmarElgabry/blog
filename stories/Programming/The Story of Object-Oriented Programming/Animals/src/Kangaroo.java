
/**
 * The Kangaroo class.
 * 
 * It Inherits from Animal Class.
 */
public class Kangaroo extends Animal{
	
    /**
     * The height of the kangaroo
     * 
     * This attribute is specific to kangaroo animals.
     * 
     * @var double
     */
	private double height;
	
	Kangaroo(String _name, String _color, double _height) {
		super(_name, _color);
		this.height = _height;
	}
	
	/**
     * A kangaroo can jump, while other animals mighn't.
     * 
     */
	public void jump(){
		System.out.println("The kangaroo with the name " + this.name + " is jumping.");
	}
	
	/**
     * This is an overridden version of the method in the parent class.
     * 
     */
	public void display(){
		System.out.println("My name is " + this.name 
				+ ", color " + this.color + " and height " + this.height 
				+". I can jump up to 30 feet high");
	}
}
