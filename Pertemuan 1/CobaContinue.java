public class CobaContinue{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){    //loop for ke-1
			for (int j=0; j<i+1; j++){ //loop for ke-2
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}


/*
	program diatas merupakan contoh pemakaian kondisi continue dimana continue berguna untuk melanjutkan ketahap selnjutnya pada perulangan. 
	pada program diatas terdapat variabel i dan j dengan tipe data int
	int i akan melakukan perulangan kebawah sampai 10 kali karena 1<10 dengan setiap barisnya berisi 1"*"
	kemudian int j akan melakukan perulangan kesamping karena j<i+1 jadi setiap "*" akan ditambah dengan 1"*"di setiap barisnya.)
	akan tetapi karena ada kondisi continue pada if (j==5) maka loopingnya akan dilanjutkan dit tahpa berikutnya jadi outputnya pada bari ke 5 dan 6 (*****) dan lanjut menjadi (******) pda baris ke tujuh dan seterusnyah ingga baris ke 10.




*/