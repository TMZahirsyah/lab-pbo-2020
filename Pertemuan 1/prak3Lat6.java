public class prak3Lat6 {	
	public static void main(String args[]) { 
		int a, b;

		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " +	b );

		b = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + b );
	}
}


/*
	 program diatas merupakan contoh pemakaian operator conditional dengan 2 variabel bertipe int
	 operator ini berfungsi untuk mengecek nilai boolean,jika true maka nilai sebelah kiri yang diambil, jika false maka nilai sebelah kanan yang diambil
	-line ke 7 b=(a==1) mengahasilkan false karena nilai a bukan 1 tetapi nilai a adalah 10 jadi nilai yang diambil yang sebelah kanan yaitu b(30) 
	-line ke 9 b(a==10) menghasilakan true karena nilai a adalah 10 sehingga nilai yang diambil yang sebleah kiri yaitu b(20)



*/