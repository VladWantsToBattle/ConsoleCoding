import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses{
	/*
		Example :
		Input : 3
		Output : 
		[
			"((()))",
			"(()())",
			"(())()",
			"()(())",
			"()()()"
		]
	*/
	public GenerateParentheses(){
		try{
			System.out.println("Generate Parentheses.");
			System.out.println("==========");
			System.out.println("Given n pairs of parentheses, write a function to generate");
			System.out.println("all combinations of well-formed parentheses.");
			System.out.println("==========");

			System.out.println("Please enter the number of pairs : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			System.out.println("Answer is : ");
			for(String item : processOutput(input)){
				System.out.println(item);
			}
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private List<String> processOutput(int input){
		List<String> returnValue = new ArrayList<String>();
		if(input == 0){
			returnValue.add("");
		} else{
			for(int c=0; c < input; c++)
				for(String left : processOutput(c))
					for(String right : processOutput(input-1-c))
						returnValue.add("("+left+")"+right);
		}
		return returnValue;
	}
}