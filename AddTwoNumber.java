import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class AddTwoNumber{
	/*Example : 
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	Explanation: 342 + 465 = 807 */

	public AddTwoNumber(){
		try{
			System.out.println("Two Sum");
			System.out.println("==========");
			System.out.println("You are given two non-empty linked list representing two non-negative ");
			System.out.println("integers. The digit are stored in reverse order and each of thier nodes");
			System.out.println("contain a single digit. Add the two numbers and return it's linked list.");
			System.out.println("");
			System.out.println("You may assume the two numbers do not contain any leading zero, except ");
			System.out.println("the number zero itself. ");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);	
			LinkedList<Integer> first = getUserInput(sc, "first");
			LinkedList<Integer> second = getUserInput(sc, "second");
			
			LinkedList<Integer> answer = processOutput(first, second);

			System.out.println(first.toString() + " + " + second.toString() + "\nAnswer : "+answer.toString());
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}

	private LinkedList<Integer> getUserInput(Scanner sc, String list){
		System.out.printf("Please enter the total number of item for the %s list\n", list);
		int total = sc.nextInt();

		LinkedList<Integer> col = new LinkedList<Integer>();
			
		for(int i=0; i<total; i++){
			System.out.printf("\nPlease enter number for item #%d :", (i+1));
			int input = sc.nextInt();
			col.add(input);
		}	
		return col;		
	}

	private LinkedList<Integer> processOutput(LinkedList<Integer> first, LinkedList<Integer> second){
		LinkedList<Integer> returnValue = new LinkedList<Integer>();
		Iterator<Integer> firstItems = first.descendingIterator();
		Iterator<Integer> secondItems = second.descendingIterator();

		int remainder = 0;
		while(firstItems.hasNext() || secondItems.hasNext()){
			int fValue = firstItems.hasNext() ? firstItems.next() : 0;
			int sValue = secondItems.hasNext() ? secondItems.next() : 0;
			int sumValue = fValue + sValue + remainder;
			remainder = sumValue / 10;

			returnValue.addFirst(sumValue%10);
		}

		return returnValue;
	}
}


