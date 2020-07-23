import java.util.Scanner;

public class SumOfThreeClosest{
	/*
		Example : 
		Input : [-1, 2, 1, -4] , 1
		Output : [-1, 2, 1] = 2
	*/
	public SumOfThreeClosest(){
		try{
			System.out.println("Given an array of nums of n integers and an integer target, find three integers in nums");
			System.out.println("such that the sum is closest to the target, return the sum of three integers. You may assume");
			System.out.println("that each input would have exactly one solution.");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the total number of item : ");
			int total = sc.nextInt();
			int[] items = new int[total];
			int target = 0;
			for(int i=0; i<total; i++){
				System.out.printf("\nPlease enter text for item #%d : ", (i+1));
				int input = sc.nextInt();
				items[i] = input;
			}

			System.out.println("Please enter the target number : ");
			target = sc.nextInt();
			System.out.printf("\nThe Answer is : %d", processOutput(items, target));
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private int processOutput(int[] items, int target){
		int returnValue = 0;
		int currentDiff = 0;
		boolean isSet = false;
		for(int x=0; x<items.length; x++){
			for(int y=0; y<items.length; y++){
				for(int z=0; z<items.length; z++){
					if((y!=x) && (z!=y&& z!=x)){
						int sum = (items[x]+items[y]+items[z]);
						int diff = (target - sum) < 0 ? (target - sum) * 1: (target - sum);
						
						if(!isSet){
							returnValue = sum;
							currentDiff = diff;
							isSet = true;
						}else{
							if(diff < currentDiff){
								returnValue = sum;
								currentDiff = diff;
							}
						}
					}
				}
			}			
		}
		return returnValue;
	}
}