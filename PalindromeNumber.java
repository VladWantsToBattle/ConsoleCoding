import java.util.Scanner;

public class PalindromeNumber{
	/*
		Example : 
		Input : 121
		Output : true

		Input : -121
		Output : false

		Input : 01 
		Output : false
	*/
	public PalindromeNumber(){
		try{
			System.out.println("Palindrome Number");
			System.out.println("==========");
			System.out.println("Determine whether an integer is a palindrome. An integer");
			System.out.println("is a palindrome when it reads the same backward as forward.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int input = sc.nextInt();
			System.out.println(input + " is" + (processOutput(input) ? " " : " not ") + "a Palindrome Number.");
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
	private boolean processOutput(int input){
		if(input < 0){
			return false;
		}
		int reverse = 0;
		int check = input;
		while(check != 0){
			reverse = (reverse*10) + check%10;
			check = check /10;
		}
		System.out.println(input + " " + check + " " + reverse);
		return reverse == input ? true : false;
	}
}