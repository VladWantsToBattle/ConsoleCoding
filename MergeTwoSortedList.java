import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class MergeTwoSortedList{
	/*
		Example :
		Input : 1->2->4, 1->3->4
		Output : 1->1->2->3->4->4
	*/
	public MergeTwoSortedList(){
		try{
			System.out.println("Merge two sorted list");
			System.out.println("==========");
			System.out.println("Merge two sorted linked lists and return its new list. The new");
			System.out.println("list should be made by splicing together the nodes of the first two lists.");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			LinkedList<Integer> firstLst = getUserInput(sc, "first");
			LinkedList<Integer> secondLst = getUserInput(sc, "second");
			for(int item : processOutput(firstLst, secondLst, new LinkedList<Integer>())){
				System.out.println(item);			
			}
		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
	
	private LinkedList<Integer> getUserInput(Scanner sc, String list){
		LinkedList<Integer> returnValue = new LinkedList<Integer>();

		System.out.printf("Please enter the total number of item for the %s list\n", list);
		int total = sc.nextInt();
		int ctr = 0;

		while(ctr < total){
			System.out.printf("\nPlease enter number for item #%d :", (ctr+1));
			returnValue.add(sc.nextInt());
			ctr++;
		}
		return returnValue;
	}

	private LinkedList<Integer> processOutput(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> returnValue){
		if(first.size() == 0 && second.size() == 0){
			return returnValue;
		}else if(first.size() == 0 && second.size() > 0){
			returnValue.add(second.get(0));
			second.remove(0);
			return processOutput(first, second, returnValue);
		}else if(first.size() > 0 && second.size() == 0){
			returnValue.add(first.get(0));
			first.remove(0);
			return processOutput(first, second, returnValue);
		}else{
			if(first.get(0) < second.get(0)){
				returnValue.add(first.get(0));
				first.remove(0);
				return processOutput(first, second, returnValue);	
			}else{
				returnValue.add(second.get(0));
				second.remove(0);
				return processOutput(first, second, returnValue);
			}
		} 
	}
}