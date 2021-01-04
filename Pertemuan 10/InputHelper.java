import java.util.Scanner;
class InputHelper{
 
 	public String getInput(String prompt) {
 		System.out.print(prompt);
 		Scanner sc = new Scanner(System.in);
 		return sc.nextLine();
 	}
}

/*
class ini adalah berisi untuk input user
*/ 