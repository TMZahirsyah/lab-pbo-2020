public class TesSiswa
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa(12345);

 		System.out.println(s.getNrp());

 		s.setNrp(8030001);
 		System.out.println(s.getNrp());
 	}
}

/* penjelasan code:
pada line 1 yaitu class TesSiswa terdapat class main dimana fungsinya menghasilkan output pada code diatas,
yaitu:
12345 
8030001
pada line 5  nilai 12345 yang terdapat pada new siswa akan dimasukan kedalam method accessor pada class siswa
pada line 9  nilai 8030001 akan dimasukkan kedalam method mutator pada class Siswa.

*/