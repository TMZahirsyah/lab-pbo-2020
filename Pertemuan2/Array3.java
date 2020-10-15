public class Array3 {
    public static void main(String args[]) {
		int[][] arrx = new int[3][3];
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3;
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6;
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9;
        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);

        int sum =0;
        for (int[] arrx1: arrx){
            for (int arrx2: arrx1){
                sum+=arrx2;
            }
        }
        System.out.println("Jumlah data : "+sum);
    }
}


/*
	Pada line ke 4- 12 merupakan nilai array
	Pada line ke 13 merupakan cara untuk menampilkan nilai array 2Dimensi pada [0][0]
	Pada line ke 14 merupakan cara untuk menampilkan nilai array 2Dimensi pada [0][1]
	Pada line ke 15 merupakan cara untuk menampilkan nilai array 2Dimensi pada [0][2]
	Pada line ke 16 merupakan cara untuk menampilkan nilai array 2Dimensi pada [1][0]
	Pada line ke 17 merupakan cara untuk menampilkan nilai array 2Dimensi pada [1][1]
	Pada line ke 18 merupakan cara untuk menampilkan nilai array 2Dimensi pada [1][2]
	Pada line ke 19 merupakan cara untuk menampilkan nilai array 2Dimensi pada [2][0]
	Pada line ke 20 merupakan cara untuk menampilkan nilai array 2Dimensi pada [2][1]
	Pada line ke 21 merupakan cara untuk menampilkan nilai array 2Dimensi pada [2][2]
	Pada line ke 24 merupakan cara melakukan looping for eacch untuk memindahkan semua data dari Array 2D arrx ke array 1D arrx1
	Pada line ke 25 merupakan cara melakukan looping for eacch untuk memindahkan semua data dari Array arrx1 ke arrx2
	Pada line ke 25 merupakan cara untuk menjumlahkan semua data dari tiap array hingga batas hingga batas arrx2 lalu disimpan kedalam sum 
	Pada line ke 25 merupakan cara menampilkan nilai dari sum atau jumlah data 








*/