import java.util.Scanner;

public class RegularExpressionMatching{
	public RegularExpressionMatching(){
		/*
			Example : 
			s = "aa"
			p = "a"
			output = false;

			s = "aa"
			p = "a*"
			output = true;

			s = "ab";
			p = ".*";
			output = true;

			s = "aab";
			p = "c*a*b";
			output = true

			s = "mississippi";
			p = "mis*is*p*.";
			output = false;
		*/
		try{
			System.out.println("Regular Expression Matching.");
			System.out.println("==========");
			System.out.println("Given an input string (s) and a pattern (p), implement regular");
			System.out.println("expressio matching with support for '.' and '*'.");
			System.out.println("'.' - Matches any single character.");
			System.out.println("'*' - Matchaes zero or more of the preceding element ");
			System.out.println("==========");

			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the string : ");
			String s = sc.nextLine();
			System.out.println("Please enter the pattern : ");
			String p = sc.nextLine();
			System.out.println("The input string " + (processOutput(s, p) ? "matches" : "did not match") + " the pattern"); 
		}catch(Exception e){	
			System.out.println("Error : "+e);
		}
	}

	private boolean processOutput(String s, String p){
		if(p.equals("")) return s.equals("");
		boolean first_match = (!s.equals("") && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
		if(p.length() >= 2 && p.charAt(1) == '*'){
			return (processOutput(s, p.substring(2)) || (first_match && processOutput(s.substring(1), p)));
		}else{
			return first_match && processOutput(s.substring(1), p.substring(1));
		}
	}
}