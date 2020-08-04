import java.util.LinkedList;
public class MergeKSorterLists{
	public MergeKSorterLists(){
		try{
			LinkedList<LinkedList<Integer>> items = new LinkedList<LinkedList<Integer>>();
			LinkedList<Integer> first = new LinkedList<Integer>();
			first.add(1);
			first.add(4);
			first.add(5);
			first.add(8);
			LinkedList<Integer> second = new LinkedList<Integer>();
			second.add(1);
			second.add(3);
			second.add(4);
			second.add(7);
			LinkedList<Integer> third = new LinkedList<Integer>();
			third.add(2);
			third.add(6);

			items.add(first);
			items.add(second);
			items.add(third);

			System.out.println("Merge K Sorted List");
			System.out.println("==========");
			System.out.println("Merge k sorted linked lists and return it as one");
			System.out.println("sorted list. Analyze and describe its complexit");
			System.out.println("==========");
			
			System.out.println("Input : ");
			System.out.println("[");
			System.out.println("[1,4,5,8],");
			System.out.println("[1,3,4,7],");
			System.out.println("[2,6]");
			System.out.println("]");

			System.out.println("Output : ");
			for(int item : mergeList(items)){
				System.out.println(item);
			}

		}catch(Exception e){
			System.out.println("Error : " + e);
		}
	}
	private LinkedList<Integer> mergeList(LinkedList<LinkedList<Integer>> items){
		if(items.size() <= 0){
			return new LinkedList<Integer>();	
		}
		if(items.size() == 1){
			return items.get(0);
		}

		LinkedList<Integer> returnValue = items.get(0);
		for(int x = 1; x<items.size(); x++){
			returnValue = processOutput(returnValue, items.get(x), new LinkedList<Integer>());
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