public class IfElseExample {	
	public static void main(String[] args) {
		int number=13;

		if(number%2==0) { 
			System.out.println("Angka genap"); 
		}
		else{ 
			System.out.println("Angka ganjil");

		}
	}
}

/*
	program diatas merupakan contoh pemakaian seleksi if-else
	 pernyataan if akan dilakukan jika nilai yang true yang dikembalikan
	 pernyataan else akan dilakukan apabial  if mengembalikan nilai false
	 pada program diatas terdapat data integer dengan variabel number= 13
		-line 5 - 9 diketahui bahwa jika number dimodulo dengan 2 mengahsilkan sisa 0 maka output yang dihasilkan adalah ""Angka genap"" 
	sedangkan hasil output yang dikeluarkan adalah "Angka ganji" berarti pernyataan pada if pada program tersebut false sehingga output
	yang dihasilan "Angka ganjil" karena 13 dimodulo dengan 2 menhasilkan sisa 1.


*/
