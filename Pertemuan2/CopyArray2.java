public class CopyArray2 {
	public static void main(String args[]) { 
		String str1 = "Pemrograman";
		String str2 = "Java";
		String str3 = "PemrogramanJava";

		System.out.println("String 1:"+str1);
		System.out.println("String 2:"+str2);
		System.out.println("String 3:"+str3);
		System.out.println("String 1 = String 3 ==> "+str1.equals(str3));
		System.out.println("String 2 = String 3 ==> "+str2.equals(str3));
		System.out.println("String 1 + String 2 = String 3 ==> "+(str1+str2).equals(str3));
	
		String str4 = "Universitas Syiah Kuala";
		String str5 = "universitas syiah kuala";
		System.out.println("String 4:"+str4);
		System.out.println("String 5:"+str5);

		System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
		System.out.println("String 4 = String 5 ==> " +str4.equalsIgnoreCase(str5));
		System.out.println("String 4 + String 5 = String 5 + String 4==>" +(str4+str5).equalsIgnoreCase(str5+str4));
	}
}


/*
	Pada program diatas merupakan program untuk menguji kesamaan string
	
	pada line ke 3-5  merupakan cara untuk menginput data string str1-3
	pada line ke 7 merupakan cara untuk  Menampilkan "String 1 : " dari nilai str1 ke layar
	pada line ke 8 merupakan cara untuk  Menampilkan "String 2 : " dari nilai str2 ke layar
	pada line ke 9 merupakan cara untuk Menampilkan "String 3 : " dari nilai str3 ke layar
	pada line ke 10 merupakan cara untuk  Menampilkan "String 1 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 (jika iya = true, jika tidak = false) karena berbeda maka FALSE 
	pada line ke 11 merupakan cara untuk Menampilkan "String 2 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 (jika iya = true, jika tidak = false) karena berbeda maka FALSE 
	pada line ke 12 merupakan cara untuk Menampilkan "String 1 + String 2 = String 3 ==>" dan membandingkan apakah data dari str1 + str2 sama dengan str3 ((jika iya = true, jika tidak = false)) karena sama maka TRUE
	pada line ke 14-15 merupakan cara untuk menginput data string str4-5
	pada line ke 16 merupakan cara untuk Menampilkan "String 4 : " dari nilai str4 ke layar
	pada line ke 17 merupakan cara untuk Menampilkan "String 5 : " dari nilai str5 ke layar
	pada line ke 19 merupakan cara untuk Menampilkan "Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil" ke layar  
	pada line ke 20 merupakan cara untuk Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 sama dengan str5 dengan mengabaikan ada huruf kapital atau tidak (jika iya = true, jika tidak = false) karena sama maka TRUE"
	pada line ke 21 merupakan cara untuk Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 + str5 sama dengan str5 + str4 dengan mengabaikan ada huruf kapital atau tidak (jika iya = true, jika tidak = false) karena sama maka TRUE
*/

