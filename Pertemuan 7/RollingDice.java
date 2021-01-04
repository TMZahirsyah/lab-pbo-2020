import java.util.Random;

public class RollingDice {
 	public static void main(String[] args) {
 
 		Random rand = new Random();
 		int tries = 0;
 		int sum = 0;
 		while (sum != 7) {
 			// roll the dice once
 			int roll1 = rand.nextInt(6) + 1;
 			int roll2 = rand.nextInt(6) + 1;
 			sum = roll1 + roll2;
 			System.out.println(roll1 + " + " + roll2 + " = " + sum);
 			tries++;
 		}
 		System.out.println("You won after " + tries + " tries!");
 	}
}

/*
code diatas merupakan permainan lempar dua dadu.
pada line ke 9 merupakan looping sampai sum = 7
pada line 11 - 12 merupakan range untuk dadu dimana rangenya yaitu 1-6
pada line 13 berfungsi agar nilai acak dua dadu dijumlahkan 
pada line 15 nilai akan terus diincrementkan selama jumlah tidak sama dengan 7.

*/