Nama 	: TM Zahirsyah
Nim	: 1908107010008

Deskripsi Program :
Program ini merupakan program  sederhana untuk mengelola penumpang bus  Trans Koetaradja
  pada program ini terdapat sebuah bus yang hanya memiliki 6 kursi penumpang yang terdiri dari 2 kursi penumpang pioritas
  dan 4 kursi penumpang biasa. Pada kursi penumpang prioritas hanya boleh diduduki oleh lansia umurunya lebih dari 60 tahun ,anak anak yang umurnya kurang dari 10 tahun danibu ibu hamil.
  Penumpang biasa tidak boleh duduk di kursi prioritas sedangkan penum-pang prioritas boleh duduk di kursi penumpang biasa maupun penumpang prioritas. jika kursai bus sudah penuh maka
  bus tidak dapat dinaikin atau diisikan penumpang lagi .


1. terdapat class Penumpang 
	Class ini mewakili objek dari penumpang buss
	Pada penumpang mempunyai atribut berupa  nama, umur, dan hamil  atau tidak
	Terdapat Method Penumpang() yang merupakan method constructor ,method ini akan memberikan nilai awal kepada attribute
	Terdapat juga Method getNama(), getUmur(), dan getHamil() yang merupakan method accessor,method ini akan mengembalikan nilai yang diminta.
2. Kelas Bus
	class ini mewa kili buss
	pada class ini terdapat atribute yang berupa objek dari class penumpang 
	terdapat penumpangBiasa yang berisi 0 samapi 4 orang dan juga terdapat objek penumpangPrioritas yang beris 0 sampai 2 orang

Terdapat Method getPenumpanBiasa() yang berfungsi untuk  mengembalikan list penumpang biasa  yang diminta dan juga 
Terdapat Method getPenumpangPrioritas() yang berfungsi untuk mengembalikan list penumpang prioritas yang diminta.

Terdapat Method getJumlahPenumpangBiasa() yang berfungsi untul mengembalikan jumlah penumpang biasa, dan juga 
Terdapat Method getJumlahPenumpangPrioritas() yang mengembalikan jumlah penumpang prioritas.

Terdapat Method naikanPenumpang() yang berfungsi untuk menambah penumpang kedalam Bus, jadi  akan
diminta data  berupa nama, umur dan keterangan hamil atau tidak, dan pada umur  akan diketahui lansia,atau tidak

Terdapat Method turunkanPenumpang(nama) yang berfungsi untuk menerima parameter nama penumpang.

Terdapat Method toString berfungsi untuk mencetak Penumpang Biasa, Penumpang Prioritas dan Jumlah Penumpang.

3. Kelas Main]
	Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan 
mensimulasikan proses naik dan turunnya penumpang dari bus.	

Cara Instalasi Program

1. Buka Folder Tugas 1
	* D:\Praktikum PBO 2020>cd Tugas 1

2. Complie Code Program
	* D:\Praktikum PBO 2020\Tugas 1\src>javac Main.java

3. Run Program
	* D:\Praktikum PBO 2020\Tugas 1\src>java Main
