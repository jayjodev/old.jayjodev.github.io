package application;

import java.util.Scanner; // used to scan values

public class SearchArrayDemo {

	public static final int NUM_OF_NAMES = 3;
	private String[] _nameList = new String[NUM_OF_NAMES];

	public void fillNameList(){
		// Declarations & Initializations
		Scanner input = new Scanner(System.in);
		for(int iElem=0; iElem < _nameList.length; iElem++){

			System.out.print("Enter the name[" + iElem + "]: ");
			_nameList[iElem] = input.nextLine();	// to scan a String

			input.close();
         }

    } // end of the fillNameList method

	public boolean findName (String name){

		for(String nameElem : this._nameList){
			// if the name exists in the array
			if(nameElem.equals(name)){
				return true;
			}
		}
		return false;
	}



}
