package clinic.programming.training;

import java.util.ArrayList; // implementation of that interface
import java.util.List; // interface

// This imports the "StringUtils" class from the "apache.commons.lang3" library. 
import org.apache.commons.lang3.StringUtils; 

public class Application {
	
	// countWords method will simply accept a string containing words separated by spaces
	// and it will return the integer representing how many words are in that string.
	public int countWords(String words) {
		//This is to utilize the "StringUtils" class, and the "split" method on that.
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0: separateWords.length;
	}
	public void great() {
		List <String> greetings = new ArrayList<>(); //generics list
		greetings.add("Hello");
		
		for (String greeting : greetings) {
			System.out.println("Greetings :" + greeting);
			
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
	
		// countWords method, passing in the string "I have four words".
		// I'm capturing the result into an integer called count,which then I use
		// in the "System.out.println". Let's save our changes and then close.
		int count =app.countWords(" I have four words ");
		System.out.println("Word Count: " + count);
    }
}