import java.util.Scanner;

public class RomanToInteger{
	private static final int[] romanNumber = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 ,4, 1};
	private static final String[] romanString = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	public RomanToInteger(){
		try{
			System.out.println("Roman to Integer");
			System.out.println("==========");	
			System.out.println("Convert a given Roman Numerals to Integer.");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a Roman Numberal : ");
			String input = sc.nextLine();
			System.out.printf("Its Integer value is : %d", processOutput(input));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private int processOutput(String input){
		if(input.length() >= 2){
			int hasValue = compareValue(input.substring(0,2));
			if(hasValue > 0){
				return hasValue + processOutput( input.substring(2,input.length()) );
			}
		}
		if(input.length() >= 1){
			int hasValue = compareValue(input.substring(0,1));
			if(hasValue > 0){
				return hasValue + processOutput( input.substring(1,input.length()) );
			}
		}
		return 0;
	}

	private int compareValue(String toCheck){
		for(int x=0; x<romanString.length; x++){
			if(romanString[x].equalsIgnoreCase(toCheck)){
				return romanNumber[x];
			}
		}
		return 0;
	}
}