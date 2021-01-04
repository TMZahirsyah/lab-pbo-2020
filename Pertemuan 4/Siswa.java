public class Siswa {
	private int nrp;
		public Siswa(int nrpx) {
		nrp = nrpx;
	}
	public void setNrp(int nrpx) {
		nrp = nrpx;
	}
	public int getNrp() {
		return nrp;
	}
}

/*
Penjelasan Code ini berhubungan denagan  Class TesSiswa.java

Dapat kita lihat pada class TesSiswa, atribut nrp dapat dengan mudahnya diubah di luar dari class Siswa.
Berarti nilai nrp bisa sangat bebas diubah dimanapun. Hal ini sangat berbahaya. Oleh karena itu atribut
di-enkapsulasi dengan hak akses private. Ubah hak akses atribut nrp menjadi private. Kemudian coba
kompilasi class TesSiswa maka akan muncul error.

Pada hak akses nrp dalam bentuk private akan menghasilkan compilasi error 
jadi kita harus menggantikan hak akses nya menjadi public. 

*/
