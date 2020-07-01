import java.util.Scanner;

public class TwoSum{
	/*
		Example:
		Given nums = [2,7,11,15], target = 9
		Because nums[0]+nums[1] = 2 + 7 = 9, return [0,1].
	*/
	public TwoSum(){
		try{
			System.out.println("Two Sum");
			System.out.println("==========");
			System.out.println("Given an array of integers, return indices of the two numbers such");
			System.out.println("that they add up to specific target, ");
			System.out.println("");
			System.out.println("You may assume that each input would have exactly one solution, and you may ");
			System.out.println("not use the same element twice.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the sum value : ");
			int sum = sc.nextInt();

			System.out.println("Please enter the total items : ");
			int total = sc.nextInt();
			int[] givenList = new int[total];
			
			for(int x=0; x<total; x++){
				System.out.println("Please enter item #"+(x+1));
				givenList[x] = sc.nextInt();
			}

			System.out.println("==========");
			
			boolean hasAnswer = false;

			for(int i=0; i<givenList.length; i++){
				for(int j=0; j<givenList.length; j++){
					if(j!=i && (givenList[i] != givenList[j])){
						if((givenList[i] + givenList[j]) == sum){
							System.out.println("Answer ["+i+" , "+j+"]");
							hasAnswer = true;
							break;
						} 
					}
				}
				if(hasAnswer){
					break;
				}
			}

			if(!hasAnswer){
				System.out.println("No combination possible");
			}
		}catch(Exception e){
			System.out.println("Errpr : "+ e);
		}
	}
} 