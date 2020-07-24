import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class LetterCombinationOfAPhoneNumber{
	private static final String LETTERS[] = new String []{
		" ", 
		"",
		"abc",
		"def",
		"ghi",
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"
	};
	public LetterCombinationOfAPhoneNumber(){
		try{
			System.out.println("Given a string containing digits from 2-9 inclusive, return all possible");
			System.out.println("letter combinations that the number could represent.");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number combination : ");
			String digits = sc.nextLine();

			System.out.println("The list of combinations are : ");
			for(String s : processOutput(digits)){
				System.out.println(s);
			}
		}catch(Exception e){
			System.out.println("Error : " + e );
		}
	}

	private List<String> processOutput(String digits){
		if(digits == null || digits.isEmpty()){
			return new ArrayList<String>();
		}
		List<String> returnValue = new ArrayList<String>();
		backTrack(digits, 0, "", returnValue);
		return returnValue;
	}

	private void backTrack(String digits, int start, String value, List<String> lst){
		if(start == digits.length()){
			lst.add(value);
			return;
		}
		String current = LETTERS[digits.charAt(start)-'0'];
		for(char c : current.toCharArray()){
			backTrack(digits, start+1, value+c, lst);
		}
	}
}