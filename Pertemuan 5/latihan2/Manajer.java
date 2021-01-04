
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		super(nama, gaji);
		this.departemen = departemen;
	}

	public void setDepartemen(String departemen) {
		this.departemen = departemen;
	}

	public String getDepartemen() {
		return this.departemen;
	}
}

/*
pada line 8 merupakan inheritance diamana kita menggunakan fungsi extend untuk memmanggil pegawai.java
pada line 11 merupakan method constractor
pada line 12 super befungsi untuk memanggil method yang ada pada super kelas
pada line 16 merupakan method mutator
pada line 20 merupakan method accesor
*/