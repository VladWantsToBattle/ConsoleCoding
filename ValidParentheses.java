import java.util.Scanner;

public class ValidParentheses{
	private static final String[] OPEN_BRACKETS = new String[]{"{", "[", "("};
	private static final String[] CLOSE_BRACKETS = new String[]{"}", "]", ")"};
	
 	public ValidParentheses(){
		try{
			System.out.println("Valid Parentheses.");
			System.out.println("==========");
			System.out.println("Given a string containing just the characters '(', ')', '[', ']', '{', '}' ");
			System.out.println("determine if the input string is valid. An input string is valid if: * Open brackets");
			System.out.println("must be closed by same type of brackets. Open brackets must be closed in correct order");
			System.out.println("==========");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a string : ");
			String input = sc.nextLine();

			System.out.printf("The input %s is " + (processOutput(input) ? "valid": "not valid") , input);
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
	private boolean processOutput(String input){
		int pos = -1;
		boolean isSet = false;
		for(int x=0; x<input.length(); x++){
			int isOpen = checkOpen(Character.toString(input.charAt(x)));
			if(isOpen > -1){
				pos = isOpen;
				isSet = true;
			}else{
				if(isSet){
					if(Character.toString(input.charAt(x)).equals(CLOSE_BRACKETS[pos])){
						if(input.length()==2){
							return true;
						}else{
							return processOutput(input.substring(0, x-1) + "" + input.substring(x+1, input.length()));		
						}
					}else{
						return false;
					}
				}
			}
		}
		return false;
	}

	private int checkOpen(String bracket){
		for(int x=0; x<OPEN_BRACKETS.length; x++){
			if(bracket.equals(OPEN_BRACKETS[x])){
				return x;
			}
		}
		return -1;
	}
}