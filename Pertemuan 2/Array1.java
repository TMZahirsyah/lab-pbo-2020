public class Array1{

public static void main(String args[]) { 
	int nilai[]= new int[3];
	nilai[0]=70;
	nilai[1]=80;
	nilai[2]=65;
	double ratarata=0.0;

	for(int i=0; i<nilai.length; i++)
		ratarata += nilai[i];

	ratarata /= nilai.length;
		System.out.println("Nilai rata-rata = " + ratarata);
	}

}


/*
	Pada line ke 10 merupakan looping hingga batas array nilai 
	pada line ke 11 merupakan cara menjumlahkan semua nilai yang ada di array satu persatu dan nantinya disimpan di ratarata
	pada line ke 13 merupakan cara menghitung jumlah rata-rata dari jumlah niali array yang sudah disimpan di ratarata dengan cara panjang nilai array dibagi 
	pada line ke 14 merupakan cara untuk menampilkan nilai rata rata yang telah dibagi sebelumnya


*/