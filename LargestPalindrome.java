import java.util.Scanner;

public class LargestPalindrome{
	/*
		Example : 
		Input : "babad"
		Output : "bab"
		Example 2 :
		Input : "cbbd"
		Output : "bb"
	*/
	public LargestPalindrome(){
		try{
			System.out.println("Largest Palindrome");
			System.out.println("==========");
			System.out.println("Given a string find the longest Palindrome substring.");
			System.out.println("==========\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a string");
			String input = sc.nextLine();
			System.out.printf("Answer is : %s", processOutput(input));

		}catch(Exception e){
			System.out.println("Error : " + e );
		}
	}

	private String processOutput(String input){
		String returnValue = "";
		
		for(int i=0; i<input.length(); i++){
			int start = i;
			for(int j=input.length()-1; j>i; j--){
				if(input.charAt(i) == input.charAt(j)){
					String testValue = input.substring(i, j+1);
					if(checkPalindrome(testValue) && testValue.length() >= returnValue.length()){
						returnValue = testValue; 
					}	
				}
			}
		}

		return returnValue;
	}

	private boolean checkPalindrome(String input){
		int mid = input.length()/2;
		int end = input.length()-1;
		for(int x=0; x<=mid; x++){
			if(input.charAt(x) != input.charAt(end)){
				return false;
			}
			end--;
		}
		return true;
	}

}

