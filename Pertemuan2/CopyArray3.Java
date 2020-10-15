public class CopyArray3 {
	 public static void main(String args[]) {
		  String str1 = "Informatika Universitas Syiah Kuala";
		  System.out.println(str1.startsWith("Inf"));
		  System.out.println(str1.endsWith("kuala"));
	      System.out.println(str1.startsWith("Inf",1));
		  System.out.println(str1.startsWith("Inf",2));
		  System.out.println(str1.startsWith("Inf",3));
	}
}

/*
	Pada program diatas merupakan program untuk menguji awalan atau akhir suatu string berntebet
	
	pada line ke 3 merupakan cara untuk menginput data str1
	pada line ke 4 merupakan cara untuk membandingkan apakah data str1 diawali dengan "Inf" atau tidak, karena diawali dengan "Inf" maka akan menampilkan nilai TRUE  
	pada line ke 5 merupakan cara untuk membandingkan apakah data str1 diakhiri dengan "kuala" atau tidak, karena str1 diakhiri dengan "Kuala" (K di str1 adalah huruf kapital) maka akan menampilkan nilai FALSE
	pada line ke 6 merupakan cara untuk membandingkan apakah data pada memori str[1] diawali dengan "Inf" atau tidak, karena str[1] diawali dengan "nfo" maka akan menampilkan nilai FALSE
	pada line ke 7 merupakan cara untuk membandingkan apakah data pada memori str[2] diawali dengan "Inf" atau tidak, karena str[2] diawali dengan "for" maka akan menampilkan nilai FALSE 
	pada line ke 8 merupakan cara untuk membandingkan apakah data pada memori str[3] diawali dengan "Inf" atau tidak, karena str[3] diawali dengan "orm" maka akan menampilkan FALSE di layar
*/