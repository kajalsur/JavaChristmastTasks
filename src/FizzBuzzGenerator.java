import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
	public boolean divisibleBy(int numerator, int Denominator) {

		if (numerator % Denominator ==0) return true;
		else return false;
		/**int answer = 0;
		return numerator % Denominator == 2;
		 */
	}
	public void DivisibleBy()
	{
		divisibleBy(4,2);
		divisibleBy(3,2);
	}

	public List<String> FizzBuzz(int startNumber, int endNumber) {
		List<String> fizzBuzzList = new ArrayList<String>();

		for (int i = startNumber; i <endNumber ; i++)

		{
			if(divisibleBy(i, 3) && divisibleBy(i, 5)) fizzBuzzList.add("\"FizzBuzz\"");
			else if (divisibleBy(i, 3)) fizzBuzzList.add("\"Fizz\"");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("\"Buzz\"");
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
	}
}
