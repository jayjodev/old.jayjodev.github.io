package application;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		// Declarations & Initializations
		ArrayList<Integer> numList = new ArrayList<Integer>();
		// add elements to the ArrayList
		// req. array: List

		numList.add(6); // index 0
		numList.add(7);
		numList.add(100);
		numList.add(56);
		numList.add(-33);
		// Get the value of an element
		//NOTE: there should be existing elements in the array
		// reg. arrar : int value = list[0]
		int value3 = numList.get(3); // get the value of at index 3
		System.out.println("The value at index 3 is: " + value3);

		// print the elements of the array list
		System.out.println("*Original ArrayList*");

		for (int index=0; index < numList.size(); index++){
			// print each element
			System.out.println("numList[" + index +"]=" + numList.get(index) );
		}

		// modify the an element in the array list
		// reg. array list  [4] = -99;
		numList.set(4, -99); // change the value at index 4 to -99
		// insert an element to the array list
		// reg. array : N/A

		numList.add(1, 78);

		// remove an element to from the array List
		// reg. array: N/A
		numList.remove(0); // remove the value at index zero

		System.out.println("\n**Modified ArrayList*");
		for (int index=0; index < numList.size(); index++){
			// print each element
			System.out.println("numList[" + index +"]=" + numList.get(index) );
		}

	}

}
