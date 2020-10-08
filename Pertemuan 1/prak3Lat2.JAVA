public class prak3Lat2 {
 public static void main(String args[]) {
	int a = 10;
	int b = 20;
	int c = 0;
	
	c = a + b;
	System.out.println("c = a + b = " + c );
	
	c += a ;
	System.out.println("c += a = " + c );
	
	c -= a ;
	System.out.println("c -= a = " + c );
	
	c *= a ;
	System.out.println("c *= a = " + c );
	
	a = 10;
	c = 15;
	c /= a ;
	System.out.println("c /= a = " + c );
	
	a = 10;
	c = 15;
	c %= a ;
	System.out.println("c %= a = " + c );
	
	c <<= 2 ;
	System.out.println("c <<= 2 = " + c );
	
	c >>= 2 ;
	System.out.println("c >>= 2 = " + c );
	
	c >>= 2 ;
	System.out.println("c >>= 2 = " + c );
	
	c &= a ;
	System.out.println("c &= a = " + c );
	
	c ^= a ;
	System.out.println("c ^= a = " + c );
	
	c |= a ;
	System.out.println("c |= a = " + c );
 }
}

/* program diatas merupakan contoh pengunaan operator assignment.
pada program diatas diketahui bahwa nilai c=0, a=10, b= 20.
-pada line ke 7 dapat diketahui bahwa itu hanya operator penjumlahan biasa,
  hanya saja hasil dari nilai tersebut akan disimpan ke c, karena c = a+b jadi nilai c 
  yang sebelumnya 0 berubah menjadi nilai a+b yaitu 10+20 = c(30)
-line 10 nilai c yang telah berubah yaitu c(30) ditambahkan dengan nilai a yaitu a(10) menghasilkan c=40 maka  nilai c sekarang adalah 40
-line 13 nilai c yang sebelumnya yaitu c(40) dikurang dengan nilai a yaitu a(10) menghasilkan c=30 maka  nilai c skarang adalah 30
-line 16 nilai c yang sebelumnya yaitu c(30) dikali dengan nilai a yaitu a(10) menghasilkan c=300 maka   nilai c sekarang adalah 300
-line 19 dan 20 diketahui bahwa terdapat nilai a dan c yang baru yaitu a=10 c=15
-line 21 nilai c yang baru yaitu 15 dibagi dengan nilai a yaitu 10  mengahsilkan 1, karena disini data tipe yang dipakai tipe data desimal yaitu int maka hasilnya bulat 
-line 26 dilakukan modulus nilai c yaitu 15 dengan nilai a yaitu 10 menghasilkan sisa bagi yaitu 5,sekarang nilai c adalah 5
-line 29  menggunakan operator bitwise yaitu left shift, yaitu operator yang digunakan untuk pergeseran bit ke kiri, operator shift left akan mengalikan suatu nilai dengan 2 
  jadi pada nilai c<<=2 itu sama saja dengan c=5<<2 sehingga nilai c sekarang adalah 20 
-line 32  juga menggunakan operator bitwise yaitu right shift,yaitu operator yang digunakan untuk pergeseran bit ke kanan, operator right shifft akan mebagi suatu nilai dengan 2
  jadi pada nilai c>>=2 itu sama saja dengan c=20>>2 sehingga nilai c sekarang adalah 5
-line 35 menggunakan operator bitwise yaitu right shift sama seperti sebelumnya pada nilai c>>=2 sama saja dengan c=5>>2 maka nilai c sekarnag adalah 1
-line 38 menggunakan operator and dimana keduanya harus benar karena c adalah c(1) dan a (10) maka ini salah sehingga niali c sekarang adalah 0
-line 41 menggunakan operator xor dimana niali c^=a sama saja dengan nilai c=c^a,jadi c=0^10 menghasilkan nilai c yang sekarang adalah 10   
-line 44 menggunakan operator or dimana jika nilai salah satunya benar maka dia akan true jadi c| = a sama saja dengan c = c | a,karena nilai c sekarang adalah 10 dan a adalah 10 maka c = 10 | 10 maka nilai c adalah 10
 
 */
 