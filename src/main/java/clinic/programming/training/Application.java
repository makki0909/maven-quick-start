package clinic.programming.training;

import java.util.ArrayList; // implementation of that interface
import java.util.List; // interface

public class Application {
	public void great() {
		List <String> greetings = new ArrayList<>(); //generics list
		greetings.add("Hello");
		
		for (String greeting : greetings) {
			System.out.println("Greeting :" + greeting);
			
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.great();
    }
}