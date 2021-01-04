class EnumExample1{
 
 	public enum Season { WINTER, SPRING, SUMMER, FALL}
 		public static void main(String[] args) {
 		for (Season s : Season.values())
 		System.out.println(s); 
 	}
} 

/*penejlasan code:
Enum merupakan tipe data yang mengandung Kumpulan konstan yang tetap. 
Enum juga dapat dianggap seperti class yang memiliki beberapa nilai konstan yang tetap. 
Enum secara bawaan merupakan turunan dari class Enum sehingga Enum tidak bisa extends class yang lain. 

output dari code diatas:
WINTER
SPRING
SUMMER
FALL

dari variabel season bertipe enum yang telah diisi dapat dicetak dengan for each dengan menggunakan
method .values()


*/