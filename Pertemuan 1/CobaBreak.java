public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
			if(j==5)
			break;
			System.out.print('*');
			}

			System.out.println();
		}
	}
}


/*
	program diatas merupakan contoh pemakaian Break dimana Break berguna untuk memberhentikan perulangang atau keluar dari suatu perulangan
	pada program diatas terdapat variabel i dan j dengan tipe data int
	int i akan melakukan perulangan kebawah sampai 10 kali karena 1<10 dengan setiap barisnya berisi 1"*"
	kemudian int j akan melakukan perulangan kesamping karena j<i+1 jadi setiap "*" akan ditambah dengan 1"*"di setiap barisnya.
	akan tetapi karena terdapat break pada j yaitu jika perulangan j telah sama dengan 5 maka perulangan j akan dihentikan sedangkan perualngan i tetap sampai 10.
	



*/