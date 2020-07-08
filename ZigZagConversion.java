import java.util.Scanner;
import java.util.Arrays;

public class ZigZagConversion{
	/*
		Example : 
		String : PAYPALISHIRING
		Row : 3
		P  A  H  N
		A PL SI IG
		Y  I  R
		Answer : PAHNAPLSIIGYIR
	*/
	public ZigZagConversion(){
		try{
			System.out.println("ZigZag Conversion");
			System.out.println("==========");
			System.out.println("Given a string and row get it's value on a zigzag pattern according to the number of rows.")
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a text : ");
			String input = sc.nextLine();
			System.out.println("Enter the number of row : ");
			int row = sc.nextInt();
			System.out.printf("Answer is : %s", processOutput(input, row));
		}catch(Exception e){
			System.out.println("Error : " + e);
		} 
	}
	private String processOutput(String input, int row){
		if(input.length() <= row){
			return input;
		}
		String[] perRow = new String[row];
		int ctr = 0;
		boolean isAdd = true;
		for(int x=0; x<input.length(); x++){
			if(perRow[ctr]==null)
				perRow[ctr] = "";

			perRow[ctr] = perRow[ctr].concat(String.valueOf(input.charAt(x)));
			
			if(ctr == 0)
				isAdd = true;
			if(ctr == (row-1))
				isAdd = false;

			if(isAdd) 
				ctr++;
			else
				ctr--;
		}

		return Arrays.toString(perRow).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
	}
}	