
/**
 * The Animal class.
 * 
 * A class that has all common properties and behaviors of animals objects.
 */

public class Animal {
	
	protected String name;
	protected String color;
	
	Animal(String _name, String _color){
		this.name = _name;
		this.color = _color;
	}

    /**
     * Set the name of the current animal
     * 
     * The access to animal's name is restricted from outside Animal and Inheriting classes.
     * So other parts of the application won’t change the current animal's name from outside.
     *
     * @param  String name
     */
	public void setName(String name) {
		this.name = name;
	}
	
    /**
     * Display the characteristics of the current animal
     * 
     */
	public void display(){
		System.out.println("My name is " + this.name 
				+ " and my color is " + this.color);
	}
}
