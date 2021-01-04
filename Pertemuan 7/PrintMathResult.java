public class PrintMathResult {
 
 	public static void main(String args[]) {
 		Math.sqrt(121.0); //no output
 		System.out.println("Square root: " + Math.sqrt(121.0));
 		double result = Math.min(3, 7) + Math.abs(-50);
 		System.out.println("Result is " + result);
 	}
}

/*

pada line 4 terdapat math.sqrt yang berfungsi untuk mencari hasil dari akar kuadrat sebuah angka.
Fungsi ini membutuhkan 1 argumen, yaitu angka yang akan dihitung.

pada line 6 terdapat Math.abs yang berfungsi untuk menghasilkan nilai absolut atau mutlak (nilai negatif akan menjadi positif, sedangkan nilai positif akan tetap positif). 
Fungsi ini membutuhkan 1 argumen angka. 



*/