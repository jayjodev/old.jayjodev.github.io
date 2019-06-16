package application;

import java.util.ArrayList;
import java.util.Scanner;

public class SortedArrayList {

	public static final int MAX_ELEMENT =5;

	public static void main(String[] args){


		//Declarations & Initializations
		ArrayList myList = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		SortedArrayList self =  new SortedArrayList();

		// prompt the user for 5 elements
		for (int index=0; index < MAX_ELEMENT; index++){
			System.out.print("myList[" + index + "] :");
			myList.add(input.nextInt());
		}

		System.out.println("The array is sorted: " + self.isSorted(myList));

	}

	// call the isSorted method to check if the array is sorted

	public boolean isSorted(ArrayList<Integer> list){

		//repeat for each element of the list
		for (int index =0; index < (list.size() -1); index++){
			// check if the two adjacent elements are NOT in ascending order

			if(list.get(index) > list.get(index +1))
			{
				return false;
			}
		}
		// the array is
		return true;

	}
}
