package constructor;
interface Animal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	abstract class Pig implements Animal {
	  abstract public void animalSound();
//	  {
//	    // The body of animalSound() is provided here
//	    System.out.println("The pig says: wee wee");
//	  }
//	  public void sleep() {
//	    // The body of sleep() is provided here
//	    System.out.println("Zzz");
	//  }
	   class dog extends pig {
		  public void animalSound() {
		    // The body of animalSound() is provided here
		    System.out.println("The pig says: wee wee");
		  }
	}

public class Consoverloading4 {//metod overloading example
	
	

		
		  public static void main(String[] args) {
		    Pig myPig = new Pig();  // Create a Pig object
		    myPig.animalSound();
		    myPig.sleep();
		  }
		}}