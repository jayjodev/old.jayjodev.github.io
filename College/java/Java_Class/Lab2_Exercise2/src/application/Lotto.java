/**Lab2_Exercise2. java
 * author: Gangrae Jo
 * purpose: Develop a Lotto application.
 */
package application;
import javax.swing.JOptionPane;
import java.util.Random;


public class Lotto {

	int [] threelotto = threeNumbers(); // instance variable array
	private int _numberofchance = 5;

	public static void main(String[] args) {
		Lotto self = new Lotto();
		self.inputAnswer();
	}

	public int[] threeNumbers() //Set up random lotto number by array
	{
		Random r = new Random();
		int[] threelotto = new int [3];
		threelotto[0]= r.nextInt(9)+1;
		threelotto[1]= r.nextInt(9)+1;
		threelotto[2]= r.nextInt(9)+1;

		return threelotto;
	}

	public void inputAnswer() //Starting point and get value
	{
		while (_numberofchance > 0)
		{
			chooseLotto(_numberofchance);
			int userValue = Integer.parseInt(JOptionPane.showInputDialog(chooseLotto(_numberofchance)));
			boolean check_lotto = checkLotto(userValue);
			resultMessage(check_lotto);

			if (_numberofchance == 0 && check_lotto == false)
			{
				JOptionPane.showMessageDialog(null,  "The Computer wins");	// If the user lose the game, this message show up.
			}
		}
	}

	public String chooseLotto(int _numberofchance) //Message for user
	{
		int chance = _numberofchance;
		String choice ="Choose a lotto Number bettween 3 and 27" +
				"\n" + "You remain "+ chance + " times chance!";
		return choice;
	}

	public boolean checkLotto(int userValue) // Check user input and Lotto number
	{
		int lottoNumber = threelotto[0] + threelotto[1]+ threelotto[2];

		System.out.print(lottoNumber);

		boolean check_lotto = true;

		if (lottoNumber == userValue)
		{
			check_lotto = true;
			_numberofchance = 0;
		}
		else
		{
			check_lotto = false;
			_numberofchance--;
		}
		return check_lotto;
	}


	public void resultMessage(boolean check_lotto)	//Result Message

	{
		if (check_lotto)
		{
			JOptionPane.showMessageDialog(null,  "You wins and the game end!");
		}
		else
		{
			if (_numberofchance != 0)
			{
				JOptionPane.showMessageDialog(null,  "Try again!!");
			}
		}
	}
}
