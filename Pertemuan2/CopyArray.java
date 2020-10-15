public class CopyArray {
	 
	 public static void main(String args[]) {
		  int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
		  int[] array2 = new int[3];
		  
		  System.arraycopy(array1,0,array2,0,3);
		  System.out.print("Array1 : ");
		  
		  for (int i=0; i<array1.length; i++)
			System.out.print(array1[i] + " ");
		  System.out.println();
		  
		  System.out.print("Array2 : ");
		  for (int i=0; i<array2.length; i++)
			System.out.print(array2[i] + " ");
	}
}


/*
	pada program diatas merupakan program untuk menyalin array ke array lain
	
	pada line ke 7 merupakan cara untuk mengcopy nilai array1 mulai dari array1[0] ke nilai array2 sebanyak 3 kali,atau seperti ini bntuknya:	
		array[0] ke array2[0]
		array[1] ke array2[2]
		array[2] ke array2[2]
	pada line ke 8 merupakan cara untuk menampilkan nilai dari Array1 
	pada line ke 10 merupakan cara untuk melakukan looping sampai batas array1
	pada line ke 11 merupakan cara untuk menampilkan nilai dari array1 sesuai i, kemudian sesudahnya ditambahkan spasi 
	pada line ke 12 merupakan cara untuk memindahkan output selanjutnya ke baris baru 
	pada line ke 14 merupakan cara untuk menampilkan nilai dari Array2
	pada line ke 15 merupakan cara untuk melakukan looping sampai batas array2
	pada line ke 16 merupakan cara untuk menampilkan nilai dari array1 sesuai i, kemudian sesudahnya ditambahkan spasi 


*/