import java.util.Random;
	
public class RandomRange {
 	public static void main(String[] args) {
 		Random num = new Random();
 		int randomnum = num.nextInt(10)+4;
 		System.out.println("Random Number: " + randomnum);
 	}
}

/*
pada line 5 dengan menggunakan class random dimana nilai acak bisa didapatkan
Class Random terletak di dalam package java.util. Objek dari class Random dapat menghasilkan random untuk  
boolean, byte, float, double, int, long dan nilai Gaussian

*/