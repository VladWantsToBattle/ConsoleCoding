import java.util.Scanner;

public class ContainerWithMostWater{
	public ContainerWithMostWater(){
		try{
			System.out.println("Container with Most Water");
			System.out.println("==========");	
			System.out.println("Given a non-negative integers a1, a2, ... , an, where each represents a point");
			System.out.println("at coordinate(i, ai). n vertical lines are drawn such that the two end points ");
			System.out.println("of the line i is at (i, ai) and (i, 0). Find the two lines, which together ");
			System.out.println("with x-axis forms a container, such that the container contains the most water");
			System.out.println("==========");	
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the total number of items : ");
			int total = sc.nextInt();

			int[] input = new int[total];

			for(int x=0; x<total; x++){
				System.out.printf("\nPlease enter number for item #%d :", (x+1));			
				input[x] = sc.nextInt();
			}
			
			System.out.printf("The Answer is : %d", processOutput(input));	
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
	private int processOutput(int[] input){
		int maxarea = 0, l = 0, r = input.length - 1;
		while (l<r){
			maxarea = Math.max(maxarea, Math.min(input[l], input[r]) * (r-1));
			if(input[l]<input[r]){
				l++;
			}else{
				r--;
			}
		}
		return maxarea;
	}
}