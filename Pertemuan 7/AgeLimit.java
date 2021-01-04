import java.util.Scanner;

public class AgeLimit {
 	public static void main(String args[]) {
 
 		int age=0;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter age ");
 		age = sc.nextInt();
 		//age=Math.max(age,0);
 		age=Math.min(40, age);
 		System.out.print("Age is "+age);
 	}
}

/*
Pada line 11 terdapat math min dimana berfungsi untuk mencari angka paling kecil diantara argumen yang diberikan 
jadi jika kita memasukkan umur diatas 40, misal 41 maka compialsi akan menghasilakn:
Age is 40.

*/