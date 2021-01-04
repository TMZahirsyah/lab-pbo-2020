public class Manajer extends Pegawai {
	private String departemen;

	public Manajer(String nama, double gaji, String departemen) {
		Pegawai p = new Pegawai(nama, gaji);
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

code manajer mengahasilkan error 
error tersebut disebabkan karena tidak adanya penurunan Method constructor  ke sub class, naholeh karena itu disini kita  akan mnenurunkan 
parameter method constructor.
*/