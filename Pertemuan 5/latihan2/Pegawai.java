
/**
 * Write a description of class Pegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pegawai {
	private String nama;
	private double gaji;
	
	public Pegawai(String nama, double gaji) {
		this.nama = nama;
		this.gaji = gaji;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return this.nama;
	}

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}

	public double getGaji() {
		return this.gaji;
	}
}

/*
pada line 12 merupakan method constractor
pada line 17 merupakan method mutator
pada line 21 merupakan method accesor
pada line 25 merupakan method mutator
pada line 29 merupakan method accesor

*/