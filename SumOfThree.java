import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class SumOfThree{
	/*
		Example :
		Input : [-1, 0, 1, 2, -1, 4]
		Output : [
			[-1,0,1],
			[-1,-1,2]
		]
	*/
	public SumOfThree(){
		try{
			System.out.println("Sum of Three");
			System.out.println("==========");
			System.out.println("Given an array nums of n integers, are threre elements a, b, c in nums such that");
			System.out.println("a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the total number of item : ");
			int total = sc.nextInt();
			int[] items = new int[total];

			for(int i=0; i<total; i++){
				System.out.printf("\nPlease enter text for item #%d : ", (i+1));
				int input = sc.nextInt();
				items[i] = input;
			}	

			System.out.println("Answer is : ");
			for(int[] item:  processOutput(items)){
				System.out.println(Arrays.toString(item));
			}
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private ArrayList<int[]> processOutput(int[] items){
		ArrayList<int[]> equalZero = new ArrayList<int[]>();
		for(int x=0; x<items.length; x++){
			for(int y=0; y<items.length; y++){
				for(int z=0; z<items.length; z++){
					if((y!=x) && (z!=y&& z!=x)){
						if((items[x]+items[y]+items[z]) == 0){
							int[] newValue = new int[] {items[x], items[y], items[z]};
							if(!checkIfExist(newValue, equalZero)){
								equalZero.add(newValue);
							}
						}
					}
				}
			}			
		}

		return equalZero;
	}

	private boolean checkIfExist(int[] toCheck, ArrayList<int[]> items){
		Arrays.sort(toCheck);
		for(int[] item : items){
			Arrays.sort(item);
			if(Arrays.equals(item,toCheck)){
				return true;
			}
		}
		return false;
	}
}