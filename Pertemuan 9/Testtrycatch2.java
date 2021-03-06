public class Testtrycatch2{
 
 	public static void main(String args[]){
 		
 		try{
 			int data=10/0;
 		}catch(ArithmeticException e){System.out.println(e);}

 		System.out.println("rest of the code...");
 	}
} 

/*
output dari code diatas:
java.lang.ArithmeticException: / by zero
rest of the code...

Catch dapat dibuat lebih dari satu jika kode program yang dibuat akan menghasilkan banyak exception.
Blok catch yang banyak (lebih dari satu) haruslah disusun dari yang paling spesifik hingga yang paling
umum. Jika muncul exception tertentu, maka catch yang paling sesuai yang akan digunakan.
Try dapat dibuat nested/bersarang. Nested try bermakna try berada di dalam try yang lain. Nested try
dibuat bila diperlukan.


*/