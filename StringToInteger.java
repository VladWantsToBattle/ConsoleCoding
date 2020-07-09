import java.util.Scanner;

public class StringToInteger{
	/*Example
		Input : 42
		Output : 42
		
		Input :     -42
		Ouput : -42

		Input : 4193 with words
		Ouput : 4193

		Input : word and 987
		Output : 0

		Input : -91283472332
		Outpu : -2147483648
	*/
	public StringToInteger(){
		try{
			System.out.println("String to Integer");
			System.out.println("==========");
			System.out.println("Convert the given string and get the integer value only.");
			System.out.println("==========");

			System.out.println("Enter the String : ");
			Scanner sc = new Scanner(System.in);

			String input = sc.nextLine();
			System.out.printf("Answer is : %d", processOutput(input));	
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
		
	}
	private int processOutput(String input){
		if(input.length() <= 0)
			return 0;
		long returnValue = 0;
		String str = input.trim();
		boolean neg = false;
		
		if(str.charAt(0) == '-'){
			neg = true;
			str = str.substring(1, str.length());
		}
		if(str.charAt(0) == '+'){
			str = str.substring(1, str.length());
		}
		
		for(int x=0; x<str.length(); x++){
			if(str.charAt(x) >= '0' && str.charAt(x) <= '9'){
				returnValue = (returnValue*10) + Integer.parseInt(String.valueOf(str.charAt(x)));
			}else{
				break;
			}
		}
		
		returnValue = neg ? returnValue * -1 : returnValue;
		
		if(returnValue > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(returnValue < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int)returnValue;
	}
}