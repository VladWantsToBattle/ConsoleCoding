import java.util.Scanner;
import java.util.Arrays;

public class LongestCommonPrefix{
	/*
		Example :
		Input : ["flow", "flight", "flower"];
		Output : "fl"
	*/
	public LongestCommonPrefix(){
		try{
			System.out.println("Longest Common Prefix");
			System.out.println("==========");
			System.out.println("Write a function to find the longest common prefix string amongst an array of Strings.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the total number of item : ");
			int total = sc.nextInt();
			sc.nextLine();
			String[] items = new String[total];

			for(int i=0; i<total; i++){
				System.out.printf("\nPlease enter text for item #%d : ", (i+1));
				String input = sc.nextLine();
				items[i] = input;
			}	

			System.out.printf("Answer is : %s", processOutput(items));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
	private String processOutput(String[] items){
		if(items.length<=0){
			return "";
		}

		String common = "";
		for(int i=0;i<items[0].length(); i++){
			for(int x=1;x<items.length; x++){
				if(i >= items[x].length() || !(Character.toString(items[x].charAt(i)).equals(Character.toString(items[0].charAt(i))))){
					return common;
				}
			}
			common = common + items[0].charAt(i);
		}

		return common;
	}
}