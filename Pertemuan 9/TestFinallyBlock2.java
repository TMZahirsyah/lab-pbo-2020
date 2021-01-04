public class TestFinallyBlock2{
 
 	public static void main(String args[]){
 
 		try{
 			int data=25/5;
 			System.out.println(data);
 		}
 		catch(ArithmeticException e){
 			System.out.println(e);
 		}
 		finally{
 			System.out.println("finally block is always executed");
 		}
 		System.out.println("rest of the code...");
 	}
} 

/*
	pada saat code di run menghasikan output 
	java.lang.ArithmeticException: / by zero
	finally block is always executed
	rest of the code...
	itu ketika  variabel data= 25/0

	sedangkan jika variabel data =25/5, maka menghasilakn output
	5
	finally block is always executed
	rest of the code...

jadi Blok finally akan selalu dieksekusi saat ada exception maupun tidak ada. Blok finally ditulis sesudah blok
try-catch. Blok finally biasanya digunakan untuk eksekusi kode penting seperti tutup connection, tutup
stream. 

- Blok try akan berisi bagian yang akan menghasilkan exception.
- Blok catch akan menangkap exception lalu menanganinya.
- Blok finally merupakan blok yang akan selalu dilakukan, saat ada atau tiada exception. 



*/