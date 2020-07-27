import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class RemoveNthNode{
	public RemoveNthNode(){
		try{
			System.out.println("Remove Nth Node from the End of List.");
			System.out.println("==========");
			System.out.println("Given a linked list, remove the n-th node from the end ");
			System.out.println("of list and return it's head");
			System.out.println("==========");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the total number of item : ");
			int total = sc.nextInt();
			LinkedList<Integer> lLst = new LinkedList<Integer>();
			
			for(int i=0; i<total; i++){
				System.out.printf("\nPlease enter number for item #%d :", (i+1));
				int input = sc.nextInt();
				lLst.add(input);
			}	
			System.out.println("Please enter the target node : ");
			int pos = sc.nextInt();

			System.out.println("The Answer is : ");

			for(int item : processOutput(lLst, pos)){
				System.out.printf(item + " ");
			}
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}

	private LinkedList<Integer> processOutput(LinkedList<Integer> lLst, int pos){
		LinkedList<Integer> returnValue = new LinkedList<Integer>();
		Iterator<Integer> desList = lLst.descendingIterator();
		int ctr = 1;

		while(desList.hasNext()){
			if(ctr != pos){
				returnValue.addFirst(desList.next());	
			}else{
				desList.next();
			}
			ctr++;
		}		
		return returnValue;
	}
}