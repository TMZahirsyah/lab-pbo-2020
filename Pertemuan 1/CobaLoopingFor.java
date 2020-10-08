public class CobaLoopingFor{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++)
		    System.out.print('*');
		    System.out.println();
		}
	}
}

/*
	program diatas merupakan contoh pemakaian looping for yang digunakan untuk melakukan perulangan dengan jumlah yang sudah diketahui.
	pada program diatas terdapat variabel i dan j dengan tipe data int
	int i akan melakukan perulangan kebawah sampai 10 kali karena 1<10 dengan setiap barisnya berisi 1"*"
	kemudian int j akan melakukan perulangan kesamping karena j<i+1 jadi setiap "*" akan ditambah dengan 1"*"di setiap barisnya.
	



*/
