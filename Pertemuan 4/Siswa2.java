//Kelas Siswa Menggunakan Keyword This

public class Siswa2 {
	public int nrp;

	public Siswa2(int nrp){
		nrp = nrp;
	}
	public void setNrp(int nrp) {
		this.nrp = nrp;
	}
	public int getNrp() {
		return nrp;
	}
}


/*
terdapat 3 method :
pada line 6 merupakan method constactor
pada line 7 terdapat nama variabel dari parameter yang dibuat sama dengan nama atribut
Java compiler mengetahui maksud dari code tersebut akan tetapi orang akan bingung membaca code tersebut.
pada line 9 merupakan method mutator
pada line 10 this berfungsi untuk menghilangkan ambigu.
pada line 12 merupakan method accesor

*/