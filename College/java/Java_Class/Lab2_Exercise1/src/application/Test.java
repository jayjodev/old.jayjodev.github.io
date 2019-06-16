/**Lab2_Exercise1. java
 * author: Gangrae Jo
 * purpose: Develop a Question application.
 */
package application;
import javax.swing.JOptionPane;
import java.util.Random;

public class Test {

	private int _correct;
	private int _incorrect;

	public static void main (String args[])
	{
		Test five_question = new Test();
		five_question.inputAnswer(); //Start by inputAnswer Method
	}

	public boolean checkAnswer(String userValue, int i) // method to check answer is correct or not. 
	{

		boolean check_answer = true;
		String [] Answer ={"b","a","c","d","a"};

		if (Answer[i].equals(userValue))
		{
			_correct++;
			check_answer = true;
		}
		else
		{
			_incorrect++;
			check_answer = false;
		}

		return check_answer;

	}
	public void generateMessage(boolean check_answer, int i) // generate Message (randomly)
	{
		Random r = new Random();
		int rndValue; //represents a random integer
		rndValue = r.nextInt(4);

		if (check_answer)
		{
			switch (rndValue)
			{
			case 0:	JOptionPane.showMessageDialog(null, "Excellent!");
			break;
			case 1:	JOptionPane.showMessageDialog(null,  "Good!");
			break;
			case 2:	JOptionPane.showMessageDialog(null,  "Keep up the good work!");
			break;
			case 3:	JOptionPane.showMessageDialog(null,  "Nice work!");
			break;
			}
		}

		else
		{
			switch (rndValue)
			{
			case 0:	JOptionPane.showMessageDialog(null, "No.Please try again");
			break;
			case 1:	JOptionPane.showMessageDialog(null,  "Wrong. Try once more");
			break;
			case 2:	JOptionPane.showMessageDialog(null,  "Don't give up!");
			break;
			case 3:	JOptionPane.showMessageDialog(null,  "No. Keep trying..");
			break;
			}
		}

		if (i == 4)
		{
			double percentage = _correct * 20;
			JOptionPane.showMessageDialog(null, "You got "+_correct + " correct answer!" +"\n"
					+ "You got "+_incorrect + " incorrect answer!"+"\n"
					+ "Your answer is "+ percentage+ "% correct.");
		}

	}
	public void inputAnswer() //Starting point
	{
		for (int i = 0; i <= 4; i++)
		{
			String userValue = JOptionPane.showInputDialog(simulateQuestion(i));
			String userinput = userValue.toLowerCase(); // Uppercase to Lowercase
			boolean check_answer = checkAnswer(userinput,  i); // Check answer
			generateMessage(check_answer, i);
		}

	}

	public String simulateQuestion(int i) // Question simulator
	{
		String Question= "_";

		switch(i)
		{
		case 0:
			Question = "1. What is the range of short data type in Java?"
					+ "\n a) -128 to 127"
					+ "\n b) -32768 to 32767"
					+ "\n c) -2147483648 to 2147483647"
					+ "\n d) None of the mentioned";
			break;
		case 1:
			Question = "2. What is the range of byte data type in Java?"
					+ "\n a) -128 to 127"
					+ "\n b) -32768 to 32767"
					+ "\n c) -2147483648 to 2147483647"
					+ "\n d) None of the mentioned";
			break;
		case 2:
			Question = "3. What is the return type of a method that does not returns any value?"
					+ "\n a) int"
					+ "\n b) float"
					+ "\n c) void"
					+ "\n d) double";
			break;
		case 3:
			Question = "4. Which of these keyword can be used in subclass to call the constructor of superclass?"
					+ "\n a) super"
					+ "\n b) this"
					+ "\n c) extent"
					+ "\n d) extends";
			break;
		case 4:
			Question = "5. Which of these standard collection classes implements all the standard functions on list data structure?"
					+ "\n a) Array"
					+ "\n b) LinkedList"
					+ "\n c) HashSet"
					+ "\n d) AbstractSet";
			break;
		}
		return Question;
	}
}
