public class prak3Lat5 {
	public static void main(String args[]) { 
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a&&b)); 
		System.out.println("a || b = " + (a||b) );
		System.out.println("!(a && b) = " + !(a && b));
	}	
}


/*
  program diatas merupakan contoh pemakaian operator Logika	
  operator logika berfungsi untuk membandingkan 2 operan bertipe boolean
	-line ke 6 (a&&b) menghasilkan false  karena b bernilai false, operator && hanya akan menghasilkan true jika nilai kedua dua nya true
	-line ke 7 (a||b) mengahsilakan true karena a bernilai true,operator || hanya akan menghasilkan false jika nilai kedua duanya false,jika hanya ada 1 true atau kedau daunya true maka akan mengahsilakn true
	-line ke 8 !(a&&b) menghasilkan true karena hasil dari (a&&b)yaitu false dinegasikan(!) menjadi true


*/