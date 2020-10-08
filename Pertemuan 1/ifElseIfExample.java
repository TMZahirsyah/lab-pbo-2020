public class IfElseIfExample {
	public static void main(String[] args) { 
		int marks=65;
		
		if(marks<50){ 
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){ 
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){ 
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80){ 
			System.out.println("B grade");
		}
        else if(marks>=80 && marks<90){ 
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100){ 
			System.out.println("A+ grade");
		}
		else{
			System.out.println("Invalid!");
		}
	}
}

/*
 program diatas merupakan contoh pemakaian seleksi if-else-if ,dimana jika kondisinya sesuai makn progrma akan menjalankna prerintah di if tersebut
 pada program diatas terdapat data integer dengan variabel marks=65
	-line 5 jika nilai marks <50 maka output yang akan muncul adalah "fail"  
	-line 8 jika nilai marks >=50 dan <60 maka output yang akan muncul adalah "D grade"
	-line 11 jika nilai marks >=60 dan <70 maka output yang akan muncul adalah "C grade"
	-line 14 jika nilai marks >=70 dan <80 maka output yang akan muncul adalah "B grade"
	-line 17 jika nilai marks >=80 dan <90 maka output yang akan muncul adalah "A grade"
	-line 20 jika nilai marks >=90 dan <100 maka output yang akan muncul adalah "A+ grade"
	-line 23 jika niali marks yang dimasukan tidak ada di dalam salah saatu case tersebut maka output yang akan muncul adalah "invalid"
	sesuai dengan kondisi if nya nilai marks 65 pada variabel marks akan menampilkan "C grade" 


*/