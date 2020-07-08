import java.util.Scanner;

public class ReverseInteger{
	/*
		Example : 
		Input : 123
		Output : 321
	*/
	public ReverseInteger(){
		try{
			System.out.println("ZigZag Conversion");
			System.out.println("==========");
			System.out.println("Given a 32 bit signed integer, reverse digits of an integer.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number : ");
			int input = sc.nextInt();
			System.out.printf("Answer : %d", processOutput(input));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private int processOutput(int input){
		int returnValue = 0;

		while(input != 0){
			returnValue = (returnValue * 10) + (input % 10);
			input = input / 10;
		}

		if(returnValue < Integer.MIN_VALUE || returnValue > Integer.MAX_VALUE)
			return 0;
		return returnValue;
	}
}