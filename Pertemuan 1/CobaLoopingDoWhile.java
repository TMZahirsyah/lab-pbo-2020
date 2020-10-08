public class CobaLoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}

/*
	pogram diatas merupakan contoh pemakaian looping do while yang digunakan untuk melakukan perulangan dengan jumlah yang belum diketahui.
	pada program diatas outputnya masih sama dengan program LoopingFor dan Looping whilekarena cara yang digunakan masih sama yaitu
	int i akan melakukan perulangan kebawah sampai 10 kali karena 1<10 dengan setiap barisnya berisi 1"*"
	kemudian int j akan melakukan perulangan kesamping karena j<i+1 jadi setiap "*" akan ditambah dengan 1"*"di setiap barisnya.




*/