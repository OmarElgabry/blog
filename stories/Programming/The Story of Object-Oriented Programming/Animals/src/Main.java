
public class Main {

	public static void main(String[] args) {
		
		// Instantiate different animal objects
		// Animal class is a generic class where Dog, Duck, & Kangaroo inherits from.
		Dog shepherd 	= new Dog("Jack", "gold");
		Duck mallard 	= new Duck("Daffy", "green");
		Kangaroo rock 	= new Kangaroo("Steve", "red", 1.5);
		
		// Accessing the animal's name attribute from outside the class is restricted
		// We can only do that by calling setName() method.
		// Now, we can change the way we store names, 
		// without breaking the other parts of the application that depends on the animal's name.
		rock.setName("Rufus");
		
		// Create an array of animals
		// Notice that an object of the type Animal can be assigned to different objects from the inheriting classes.
		// Animal animal = new Dog("Jack", "gold");
		// 		  animal = new Duck("Daffy", "green");
		// 		  animal = new Kangaroo("Steve", "red", 1.5);
		Animal animals [] = { shepherd, mallard, rock };
		
		// Call display() method on every animal object
		// Now, you should notice we called the display() method on animal objects, 
		// without knowing exactly what class the animal object was instantiated from, 
		// and it did displayed the correct characteristics for each animal object.
		for(Animal animal: animals){
			animal.display();
		}
	}
}
