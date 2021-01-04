public class TesSiswa {
 	public static void main(String[] ar) {
 		Siswa s = new Siswa(12345);
 		s.nrp = 8030001;
 		System.out.println(s.nrp);
		
		s.nrp = 8030002;
 		System.out.println(s.nrp);
 	}
}

/*
code diatas menghasilkan error 

hal ini disebabkan karena Hak ases pada class Siswa Hak askes bersifat private
jadi solusinya yaitu class Siswa harus diberikan hak akses public 
*/