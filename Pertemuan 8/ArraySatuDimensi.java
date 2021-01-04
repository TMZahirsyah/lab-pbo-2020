import java.util.Arrays;

public class ArraySatuDimensi {
 	public static void main(String[] args) {
 		System.out.println("Array of primitives");
 		int[] ints = {9, 6, 3};
 		Arrays.sort(ints);
 		for (int i = 0; i < ints.length; i++) {
 			System.out.println(ints[i]);
 		}

 		System.out.println("Array of strings");
 		String[] strings = {"Merah", "Hijau", "Biru"};
 		Arrays.sort(strings);
 		for (String color : strings) {
 			System.out.println(color);
 		}
 
 		System.out.println("Setting an initial size");
 		int[] sized = new int[10];
 		for (int i = 0; i < sized.length; i++) {
 			sized[i] = i * 100;
 		}
 
 		for (int value : sized) {
 			System.out.println(value);
 		}
 		System.out.println("Copying an array");
 		int[] copied = new int[5];
 		System.arraycopy(sized, 5, copied, 0, 5);
 		for (int value : copied) {
 			System.out.println(value);
 		}
 	}
} 

/*
pada line 5 Array primitives
menghasilkan output:
3
6
9 
disini array yang disorting  dari nilai terkecil yaitu 3

pada line 12 Array of strings
menghasilkan output:
Biru
Hijau
Merah 
disini array yang disorting berdasarkan warna dengan hurf awalan pertama yaitu biru

pada line 19 Setting an initial size
menghasilkan output:
0
100
200
300
400
500
600
700
800
900 
disini array yang disortinng dari size yang paling kecil yaitu nol (0)

Pada line 28 copying array
Array di java dapat disalin ke array lain menggunakan cara berikut:
Menggunakan tugas variabel. Metode ini memiliki efek samping karena perubahan elemen array mencerminkan kedua tempat tersebut. Untuk mencegah efek samping ini, berikut adalah cara yang lebih baik untuk menyalin elemen array.

Buat array baru dengan panjang yang sama dan salin setiap elemen.

Gunakan metode klon dari larik. Metode klon membuat larik baru dengan ukuran yang sama.


*/
