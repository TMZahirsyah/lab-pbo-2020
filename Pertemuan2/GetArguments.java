public class GetArguments{

public static void main(String args[]) { 
	System.out.println("Tanggal : " + args[0]);
	System.out.println("Bulan : " + args[1]);
	System.out.println("Tahun : " + args[2]);
	}
}

/*
	Pada program diatas merupakan program untuk mendapatkan nilai argumen pada method main
	pada saat menjalankan program setelah nama program  barulah tanggal yang diperlukan(23 maret 2017) diinput hal ini digunkana karena dalam method main memiliki parameter berupa array dengan tipe string sehingga berapapun argumen yang diketik saat runing pasti disimpan dalam array tersebut dan diakses dengan menggunakan indeks 
	pada line ke 3 merupakan cara untuk menampilkan  data array string yang disimpan pada args[0]
	pada line ke 4 merupakan cara untuk menampilkan  data array string yang disimpan pada args[1]
	pada line ke 5 merupakan cara untuk menampilkan  data array string yang disimpan pada args[2]

*/