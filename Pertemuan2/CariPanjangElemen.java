public class CariPanjangElemen {
	 public static void main(String args[]) {
		  int x[][][][]=new int[2][][][];

		  x[0]=new int[1][][];
		  x[0][0]=new int[2][];
		  x[0][0][0]=new int[3];
		  x[0][0][1]=new int[2];
		  x[1]=new int[2][][];
		  x[1][0]=new int[1][];
		  x[1][0][0]=new int[2];
		  x[1][1]=new int[2][];
		  x[1][1][0]=new int[1];
		  x[1][1][1]=new int[3];

		  System.out.println(x.length);
		  System.out.println(x[0].length);
		  System.out.println(x[0][0].length);
		  System.out.println(x[0][0][0].length);
		  System.out.println(x[0][0][1].length);
		  System.out.println();
		  System.out.println(x[1].length);
		  System.out.println(x[1][0].length);
		  System.out.println(x[1][0][0].length);
		  System.out.println(x[1][1].length);
		  System.out.println(x[1][1][0].length);
		  System.out.println(x[1][1][1].length);
	}
}


/*
	Pada program diatas merupakan program untuk melihat panjang array
	Pada line ke 5-14 merupakan nilai array
	Pada line ke 16 merupakan cara untuk menampilkan panjang array x
	Pada line ke 17 merupakan cara untuk menampilkan panjang array x[0]
	Pada line ke 18 merupakan cara untuk menampilkan panjang array x[0][0]
	Pada line ke 19 merupakan cara untuk menampilkan panjang array x[0][0][0]
	Pada line ke 20 merupakan cara untuk menampilkan panjang array x[0][0][1]
	Pada line ke 21 merupakan cara untuk menampilkan (void) yang berfungsi untuk memindahkan output selanjutnya ke baris baru 
	Pada line ke 22 merupakan cara untuk menampilkan panjang array x[1]
	Pada line ke 23 merupakan cara untuk menampilkan panjang array x[1][0]
	Pada line ke 24 merupakan cara untuk menampilkan panjang array x[1][0][0]
	Pada line ke 25 merupakan cara untuk menampilkan panjang array x[1][1]
	Pada line ke 26 merupakan cara untuk menampilkan panjang array x[1][1][0]
	Pada line ke 27 merupakan cara untuk menampilkan panjang array x[1][1][1]

*/