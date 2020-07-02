import java.util.Scanner;

public class LongestSubstring{

	public LongestSubstring(){
		/*
		Example :
		Input : "abcabcbb"
		Output : 3
		Eplanation: The answer is "abc", with the length of 3 
		*/
		try{
			System.out.println("Longest Substring Length");
			System.out.println("==========");
			System.out.println("Given a string, find the length of the longest substring without");
			System.out.println("reapeating characters.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the String : ");
			String givenText = sc.nextLine(); 
			System.out.println(givenText);

			System.out.printf("\nThe Answer is %d", processOutput(givenText));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}	

	private int processOutput(String givenText){
		int total = givenText.length(), ans = 0;
		int[] index = new int[128];
		for(int i=0, j=0; j < total; j++){
			i = Math.max(index[givenText.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[givenText.charAt(j)] = j + 1;
		}
		return ans;
	}
}

