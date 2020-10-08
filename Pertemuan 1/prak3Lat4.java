public class prak3Lat4 {
	public static void main(String args[]) {
		int a = 60;	/* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */ 
		int c = 0;

		c = a & b;	/*12=	0000 1100	*/
		System.out.println("a & b	= " + c );	

		c = a | b;	/*61=	0011 1101	*/
		System.out.println("a | b	= " + c );	
	
		c = a ^ b;	/*49=	0011 0001	*/
		System.out.println("a ^ b	= " + c );	

		c = ~a;	/*-61 =	1100 0011	*/
		System.out.println("~a = " + c	);	

		c = a << 2; /* 240 = 1111 0000 */ 
		System.out.println("a << 2 = " + c );

		c = a >> 2;	/* 15 = 0000 1111 */
		System.out.println("a >> 2	= " + c );

		c = a >>> 2; /* 15 = 0000 1111 */ 
		System.out.println("a >>> 2 = " + c );
	}
}

/*/*
	program diatas merupakan contoh pemakaian operator bitwise
	-line ke 7 menggunakan operasi bitwise AND pada angka biner dari a(60) dan b(13) dimana akan menghasilakan angka biner dari c(12)   
		pada operator bitwise AND nilai dari a dan b harus benar kedua-dua nya
	-line ke 10 menggunakan operasi bitwise OR  pada angka biner dari a(60) dan b(13) dimana akan menghasilakan angka biner dari c(61) 
		pada opertor bitwise OR nilai dari salah satu variabel a atau b benar maka nilai bitnya akan benar
	-line ke 13 menggunakan operassi bitwise XOR pada angka biner dari a(60) dan b(13) dimana akan menghasilakan angka biner dari c(49)
		pada Operator bitwise XOR nilainya akan benar apabila salah satunya saja benar 
	-line ke 16 menggunakan operasi bitwise complement pada angka biner dari nilai (-a)-1 dimana akan mengahsilkan (-60)-1= -61
		pada operator complement nilai suatu variabel akan dinegasikan dan ditambah 1 
	-line ke 19 menggunakan operasi bitwise SHIFT LEFT pada angka biner dari a(60) dimana akan meghasilkan angak biner dari c(240)
		pada operator bitwise SHIFT RIGHT nilai bit digeser ke arah kiri
	-line ke 22 menggunakan menggunakan operasi bitwise SHIFT RIGHT pada angka biner dari a(60) dimana akan meghasilkan angka biner dari c(15)
		pada operator bitwise SHIFT RIGHT nilai bit digeser ke arah kanan
	-line ke 25 menggunakan menggunakan operasi bitwise SHIFT RIGHT pada angka biner dari a(60) dimana nilai yang digeser sebanyak 2 akan diisi dengan 0 sehingga meghasilkan angka biner dari c(15)

*/*/