import java.util.Scanner;

public class IntegerToRoman{
	private static final int[] romanNumber = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 ,4, 1};
	private static final String[] romanString = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	public IntegerToRoman(){
		try{
			System.out.println("Integer to Roman");
			System.out.println("==========");	
			System.out.println("Convert a given Integer to Roman Numerals.");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number : ");
			int input = sc.nextInt();
			System.out.printf("Its Roman value is : %s", processOutput(input));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private String processOutput(int input){
		for(int i=0; i<romanNumber.length; i++){
			if(input >= romanNumber[i]){
				return romanString[i] + processOutput(input-romanNumber[i]);
			}
		}
		return "";
	}
}