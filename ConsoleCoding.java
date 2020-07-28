import java.util.Scanner;

public class ConsoleCoding{


	public static void main(String []args){
		try{
			System.out.println("Choices :");
			System.out.println("[0] Two Sum.");
			System.out.println("[1] Add Number.");
			System.out.println("[2] Longest Substring Length.");
			System.out.println("[3] Median of two Arrays.");
			System.out.println("[4] Largest Palindrome.");
			System.out.println("[5] ZigZag Conversion.");
			System.out.println("[6] Reverse Integer.");
			System.out.println("[7] String to Integer.");
			System.out.println("[8] Palindrome Number.");
			System.out.println("[9] Regular Expression Matching.");
			System.out.println("[10] Container with Most Water.");
			System.out.println("[11] Integer to Roman.");
			System.out.println("[12] Roman to Integer.");
			System.out.println("[13] Longest Common Prefix.");
			System.out.println("[14] Sum of Three.");
			System.out.println("[15] Sum of Three Closest.");
			System.out.println("[16] Letter Combination of a Phone Number.");
			System.out.println("[17] Remove the Nth node from End of List.");
			System.out.println("[18] Valid Parentheses.");

			System.out.println("'Welcome', Please choose a item from the choices above : ");
			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();

			switch (selection){
				case 0 : 
						new TwoSum();
					break;
				case 1 : 
						new AddTwoNumber();
					break;
				case 2 : 
						new LongestSubstring();
					break;
				case 3 : 
						new MedianTwoArray();
					break;
				case 4 : 
						new LargestPalindrome();
					break;
				case 5 : 
						new ZigZagConversion();
					break;
				case 6 :
						new ReverseInteger();
					break;
				case 7 :
						new StringToInteger();
					break;
				case 8 : 
						new PalindromeNumber();
					break;
				case 9 : 
						new RegularExpressionMatching();
					break; 
				case 10 :
						new ContainerWithMostWater();	
					break;
				case 11 : 
						new IntegerToRoman();
					break;
				case 12 : 
						new RomanToInteger();
					break;
				case 13 : 
						new LongestCommonPrefix();
					break;  
				case 14 : 
						new SumOfThree();
					break;
				case 15 : 
						new SumOfThreeClosest();
					break;
				case 16 : 
						new LetterCombinationOfAPhoneNumber();
					break;
				case 17 :
						new RemoveNthNode();
					break;
				case 18 : 
						new ValidParentheses();
					break;
				default : 
					System.out.println("Option not available");
			}
		}catch(Exception e){
			System.out.println("Error : " + e);

		}
	}	
}
