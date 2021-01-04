public class TesSiswa2
{
 	public static void main(String[] ar)
 	{
 		Siswa s = new Siswa();
 		Siswa ss = new Siswa(8030001, "Upin");

 		//ini akan menimbulkan error
 		//Siswa sss = new Siswa(8030002);
 		System.out.println(s.getNrp() + " " + s.getNama());
 		System.out.println(ss.getNrp() + " " + ss.getNama());
 	}
}

/*
code diatas menghasilkan error 

hal tersebut disebabkan karena: 
pada line 5 objek s menggunakan method constructor tanpa parameter sedangkan 
pada lline 6 objek ss menggunakan method constructor dengan dua parameter (int dan String).

*/