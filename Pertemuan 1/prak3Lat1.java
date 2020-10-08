class prak3Lat1 {
 
 public static void main(String args[]) {
	int a = 10;
	int b = 20;
	int c = 25;
	int d = 25;
 
	System.out.println("a + b = " + (a + b) );
	System.out.println("a - b = " + (a - b) );
	System.out.println("a * b = " + (a * b) );
	System.out.println("b / a = " + (b / a) );
	System.out.println("b % a = " + (b % a) );
	System.out.println("c % a = " + (c % a) );
	System.out.println("a++ = " + (a++) );
	System.out.println("b-- = " + (a--) );
 
	System.out.println("d++ = " + (d++) );
	System.out.println("++d = " + (++d) );
 }
}

/*
program diatas merupakan operator aritmatika dimana dilamnya terdapat: 
tambah (+) yang digunkana untuk menambah dua nilai asal yang digunakan didalam proses operasi 
kurang (-)  yang digunkana untuk mengurangi dua nilai asal yang digunakan didalam proses operasi 
kali (*) digunakan untuk mengalikan dua nilai asal yang digunakan didalam proses operasi 
bagi (/) digunakan untuk membagi dua nilai asal yang digunakan didalam proses operasi 
modulus (%) % digunakan untuk mencari nilai sisa pembagian dua nilai asal yang digunakan didalam proses operasi 
increment (++) digunakan untuk menambah nilai asal yang digunakan didalam proses operasi  dengan 1
decrement (--) digunakan untuk mengurangi nilai asal yang digunakan didalam proses operasi dengan 1
misal pada line ke 9 ada a+b disitu diketahui bahwa nilai int a adalah 10 dan int b adalah 20 jadi a+b sama dengan 10+20 yang mengahsilkan 30. 
Sama seperti petambah pengurangan, pekalian dan, pembagian seperti itu  juga, 
berbeda dengan modulus % dimana pada line ke 14, modulus diambil sisa dari nila baginya jadi jika c % a dengan nilai c berupa 25 dan a adalah 10 maka modulus akan membaca sisa dari pembagian tersebut yaitu 5 dimana 25 dibagi 10 sama dengan 2,5 jadi 5 pada 2,5 akan menjadi sisa dan angka tersebut yang akan diambil
pada line 19 terdapat increment  dimana ++d merupakan pre increment sehingga nilai pada d akan di tambah sebanyak 1 angka,lalu baru hasilnya keluar sedangakan pada d++ akan menampilkan nilai d , lalu di tambah sebnyak 1 angka 
sama sepert ++ pada -- juga seperti itu hanay saja di kurangkan 1
*/