package application;

public class ArraysMethodsDemo {

	public static final int NUM_OF_ELEMENTS = 5;

	public static void main(String[] args){

		// Declarations & initializations
		int[] numBox = new int[NUM_OF_ELEMENTS];
		// initialize the elements
		numBox[0]= -33;
		numBox[1]= 56;
		numBox[2]= 100;
		numBox[3]= 25;
		numBox[4]= 41;

		ArraysMethodsDemo self = new ArraysMethodsDemo();

		// print the elements of numBox
         self.printArrayElements(numBox);


		System.out.println("\nPrint  the elements in reversed order : ");
		// print the elements of the array in reversed order
         self.ReversedArrayElements(numBox);

	}// end of the main method

	public void printArrayElements(int[] arr){
		// repeat for all elements of the array
		for (int iElem = 0; iElem < arr.length; iElem++){

			// print each element
			System.out.println("Element [" + iElem +"]: "+ arr[iElem]);
		}

	}// end of the printArrayElements method

	public void ReversedArrayElements(int[] arr){
		// repeat for all elements of the array
		for (int iElem = (arr.length - 1); iElem >= 0; iElem--){

			// print each element
			System.out.println("Element [" + iElem +"]: "+ arr[iElem]);
		}

	}

}// end of the class
