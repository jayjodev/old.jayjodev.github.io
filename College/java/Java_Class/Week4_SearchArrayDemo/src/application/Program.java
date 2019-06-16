package application;

public class Program {

	public static void main(String[] args) {
		// Declarations & Initializations
		SearchArrayDemo obj = new SearchArrayDemo();

		// fill the array
		obj.fillNameList();

		// search for your name in the array
		if (obj.findName("Elmira")){

			System.out.println("You are on the list.");
		}
		else{
			System.out.println("Your name was not there!");
		}




	}

}
