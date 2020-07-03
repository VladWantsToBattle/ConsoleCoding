import java.util.Scanner;
import java.util.Arrays;

public class MedianTwoArray{
	/*
		Example:
		nums1 : [1,3]
		nums2 : [2]
		answer : 2.0
	*/
	public MedianTwoArray(){
		try{
			System.out.println("Median of two arrays");
			System.out.println("==========");
			System.out.println("Find the meadian of two sorted array the array cannot be empty.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			int[] nums1 = getUserInput(sc, "first");
			int[] nums2 = getUserInput(sc, "second");
			System.out.printf("\nAnswer is %f", processOutput(nums1, nums2));
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}

	private int[] getUserInput(Scanner sc, String list){
		System.out.printf("Please enter the total number of item for the %s list\n", list);
		int total = sc.nextInt();
		int[] returnValue = new int[total];

		for(int i=0; i<total; i++){
			System.out.printf("\nPlease enter number for item #%d :", (i+1));
			int input = sc.nextInt();
			returnValue[i] = input;
		}	

		return returnValue;
	}

	private double processOutput(int[] first, int[] second){
		int fLen = first.length;
		int sLen = second.length;
		int totalSize = fLen + sLen;
		int[] combined = new int[totalSize];

		System.arraycopy(first,0,combined,0, fLen);
		System.arraycopy(second,0,combined,fLen, sLen);
		Arrays.sort(combined);

		if(combined.length%2==1){
			return (double) combined[combined.length/2];
		}else{
			int mid = combined.length/2;
			return (combined[mid] + combined[mid-1])/2.0;
		}
	}
}

