import java.util.Random;

public class RandomSeriesSeed {
 	public static void main(String[] args) {

 		Random rand = new Random(20);
 		System.out.println("Random Number 1: " + rand.nextInt(100));
 		System.out.println("Random Number 2: " + rand.nextInt(100));
 		System.out.println("Random Number 3: " + rand.nextInt(100));
 		System.out.println("Changing seed to change to sequence");
 		rand.setSeed(5);
 		System.out.println("Random Number 4: " + rand.nextInt(100));
 		System.out.println("Random Number 5: " + rand.nextInt(100));
 		System.out.println("Random Number 6: " + rand.nextInt(100));
 		System.out.println("Setting seed 40 to produce the previoussequence");
 		rand.setSeed(20);
 		System.out.println("Random Number 7: " + rand.nextInt(100));
 		System.out.println("Random Number 8: " + rand.nextInt(100));
 		System.out.println("Random Number 9: " + rand.nextInt(100));
 	}
}

/*
penjelasan code:
sama seperti  code sebelumnya, hanya saja pada code inti dibuat untuk mengetes class random pada angka yang lebih besar

dibalik fungsi random, ada sebuah formula matematika yang sangat kompleks. Dan ternyata penggenerate angka acak tersebut 
mengacu pada system time, yang tentu saja waktu akan terus berbeda setiap harinya.

*/