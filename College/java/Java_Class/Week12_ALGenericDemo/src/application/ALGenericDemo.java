package application;

import java.util.ArrayList;

public class ALGenericDemo {

	public static void main(String[] args){
		//Declarations & Initialization

		ArrayList nameList = new ArrayList(); // class Object << List type is Object!

		// add one element
		nameList.add("John"); // String is converted to Object.
		nameList.add(5); // NOTE: generic of the array is more type safe.
						 // getting a syntax for adding an element of the wrong type.
		String fristName = (String)nameList.get(0);

	}

}
