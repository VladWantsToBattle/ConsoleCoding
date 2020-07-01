import java.util.Scanner;

public class ConsoleCoding{


	public static void main(String []args){
		try{
			System.out.println("Choices :");
			System.out.println("[0] Two Sum.");
			System.out.println("[1] Add Number.");

			System.out.println("'Welcome', Please choose a item from the choices above : ");
			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();

			switch (selection){
				case 0 : 
						new TwoSum();
					break;
				case 1 : 
						new AddTwoNumber();
					break;
				default : 
					System.out.println("Option not available");
			}
		}catch(Exception e){
			System.out.println("Error : " + e);

		}
	}	
}
