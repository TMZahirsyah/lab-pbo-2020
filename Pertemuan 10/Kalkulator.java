import java.util.Scanner;

public class Kalkulator {
 	public static void main(String[] args) {
 		Kalkulator kalkulator = new Kalkulator();
 		kalkulator.perhitungan();
 	}
 	
 	protected void perhitungan() {
 		InputHelper input = new InputHelper();
 		String s1 = input.getInput("Masukkan angka: ");
 		String s2 = input.getInput("Masukkan angka: ");
 		String op = input.getInput("Pilih operasi (+ - * /):");
 		double result = 0;
 
 	try {
 		switch (op) {
 			case "+":
 			result = MathHelper.penambahan(s1, s2);
 			break;
 			case "-":
 			result = MathHelper.pengurangan(s1, s2);
 			break;
 			case "*":
 			result = MathHelper.perkalian(s1, s2);
 			break;
 			case "/":
 			result = MathHelper.pembagian(s1, s2);
 			break;
 			default:
 			System.out.println("Operasi tidak dikenal!");
 			return;
 		}
 		System.out.println("Hasil: " + result);
 	} catch (Exception e) {
 		System.out.println("Number formatting exception " +
		e.getMessage());
 	    }
	}
}
/*
code ini di buat untuk mencoba sebuah kalkulator yang dpt melakukan operasi matematika

pada line 17 - 33 merupakan kondisi untuk user memilih operasi perhitungan.

Terdapat juga  exception handling, Exception merupakan suatu kondisi abnormal yang terjadi saat menjalankan program yang dapat
mengganggu jalannya program secara normal.
	
*/