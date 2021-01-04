//Kelas siswa Yang menggunakan Method Overloading

public class Siswa3
{
 	private int nrp;
 	private String nama;

 	public Siswa3()
 	{
 		this.nrp = 12345;
 		this.nama = "nama default";
 	}

 	public Siswa3(int nrp, String nama)
 	{
 		this.nrp = nrp;
 		this.nama = nama;
 	}

 	public void setNrp(int nrp)
 	{
 		this.nrp = nrp;
 	}

 	public int getNrp()
 	{
 		return this.nrp;
 	}

 	public void setNama(String nama)
 	{
 		this.nama = nama;
 	}

 	public String getNama()
 	{
 		return this.nama;
 	}
}


/*
pada line 8 - 18 merupakan method overloading
pada line 20 merupakan method mutator
pada line 25 merupakan method accesor
pada line 30 merupakan method mutator
pada line 35 merupakan method accesor

Method overloading merupakan beberapa method yang memiliki nama method yang sama akan tetapi berbeda
dari jumlah parameter, tipe data parameter dan urutan parameter. Saat objek menggunakan method yang memiliki method
overloading, maka compiler akan mencari padanan yang paling sesuai dengan method overloading yang
ada. Jika tidak ada padanan maka akan muncul error.


*/