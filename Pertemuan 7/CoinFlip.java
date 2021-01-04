import java.util.Random;

public class CoinFlip {
 	public static void main(String[] args) {
 	// 50% chance heads, 50% chance tails
 		Random rand = new Random();
 		double chance = rand.nextDouble();
 		if (chance < 0.5) {
 				System.out.println("heads!");
 			} 
 		else {
 			System.out.println("tails!");
 		}
 	}
}

/*
code ini di buat untuk mengetes math random dalam coin
line 1 import java.util.Random menghasilkan compilasi Random.
objek random diatas membuat nilai acak untuk double.

Pada line 6 untuk membuat suatu object Random kelas Random juga harus diinstantiasi .
pada line 7 kita memilih sebuah double random dan memasukkannya ke dalam variabel rand

*/