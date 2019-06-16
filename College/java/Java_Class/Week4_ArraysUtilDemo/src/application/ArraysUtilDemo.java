package application;

import java.util.Arrays;

public class ArraysUtilDemo {

	public static void main(String[] args){


		// Declarations & initializations
		int[] numBox = {-33, 56, 100 , 25 , 41};

		// print the elements of numBox
        System.out.println("Array elements " + Arrays.toString(numBox));

        // make a copy of numBox
        int[] copyNumBox = Arrays.copyOf(numBox, numBox.length);
        // sort the elements of the array in ascending
        Arrays.sort(copyNumBox);

        System.out.println("sorted Array elements " + Arrays.toString(copyNumBox));
        
        // Resize numBox
        int[] bigNumBox = Arrays.copyOf(numBox, 10);
        
        System.out.println("Resized Array elements " + Arrays.toString(bigNumBox));
        



	}// end of the main method

}// end of the class