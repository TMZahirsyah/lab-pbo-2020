public class Siswa {
	private int nrp;
	
	public Siswa(int nrpx)
	{
	nrp = nrpx;
	}

	public void setNrp(int nrpx)
	{
	nrp = nrpx;
	}

	public int getNrp()
	{
	return nrp;
	}
}

/*

	Method contractor merupakan method yang befusngsi memberi nilai awal pada semua atribut/ instance
variable. Dalam pemrograman Java,pada  method constructor secara default sudah ada nilai awal yang
digunakan sesuai dengan tipe data.
pada line 4 merupakan method constractor

	Method mutator merupakan method yang berfungsi untuk mengubah nilai dari atribut/ instance
variable. Method mutator biasanya bertipe data kembalian sebagai void, namun memiliki parameter.
pada line 9 merupakan method mutator



Method accessor merupakan method yang digunakan untuk mengakses/mengembalikan nilai dari
atribut tertentu. Method accessor memiliki tipe data kembalian sehingga memiliki keyword return di dalam methodnya. Namun method ini biasanya tidak memiliki parameter. 
pada line 14 merupakan method mutator

*/
