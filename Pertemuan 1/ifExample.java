import java.util.Scanner;

public class IfExample {	
	public static void main(String[] args) { 
		int age=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda:"); 
		age = sc.nextInt();
		
		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}

/*
	program diatas merupakan contoh pemakaian seleksi if dimana keadaan akan mengembalikan nilai boolean.
	terdapat juga funsi scanner pada program di atas dimana fungsi scaner ini akan mengambil nilai yang diinput oleh user
	 -line 8,9 user diminta untuk memasukan umur 
	 -line 11 jika kita memasukan umur sama dengan 17 tahun atau diatas 17tahun maka program akan menghasilkan output "Anda sudah boleh buat KTP"




*/