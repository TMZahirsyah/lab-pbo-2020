public class CobaLoopingWhile{
	
	public static void main(String[] args){
		int i=0;
		while (i < 10){
			
			int j = 0;
			while (j < i+1){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}
}



/*
	program diatas merupakan contoh pemakaian looping while yang digunakan untuk melakukan perulangan dengan jumlah yang belum diketahui.
	pada program diatas outputnya masih sama dengan program LoopingFor karena cara yang digunakan masih sama yaitu
	int i akan melakukan perulangan kebawah sampai 10 kali karena 1<10 dengan setiap barisnya berisi 1"*"
	kemudian int j akan melakukan perulangan kesamping karena j<i+1 jadi setiap "*" akan ditambah dengan 1"*"di setiap barisnya.






*/

