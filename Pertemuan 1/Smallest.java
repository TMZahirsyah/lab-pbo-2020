public class SmalLest{
	public static void main(String[] args){
		int a, b;

		Mulai:
		for(a=0; a<2; a++){
			for(b=0; b<3; b++){
				if(b==2)
					break Mulai;
				System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}

/*
	program diatas merupakan contoh pemakaian label break dimana label break ini berguna untuk menghentikan operasi sesuai dengan looping yang diinginkan
	pada program di atas break akan menghentikan operasi pada pernyataan mulai sehingga berarti keluar dari looping ke 1 dan tampilan outpunya adalah
	a=0 ; b=0
	a=0 ; b=1





*/