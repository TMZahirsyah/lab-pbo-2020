import java.util.*;

public class Main {
    private static Scanner input;
    private boolean main;
    private int pilihan;

    public Main() {
        this.main = true;
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        new Main().mainkan();
    }

    public void mainkan(){
        Bus bus1 = new Bus();


        System.out.println("\n---------------------------");
        System.out.println(">>>\tTRANS KOETARADJA\t<<<");
        System.out.println("---------------------------");
        while(main){
            System.out.println("\nMENU : ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. List Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Nomor : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("\nIsi Data Anda Terlebih Dahulu");
                System.out.print("\nMasukan Nama\t: ");
                String nama = input.next();
                System.out.print("Masukan Umur\t: ");
                int umur = input.nextInt();
                System.out.print("Hamil [y/n]\t: ");
                Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;

                System.out.println("\n----------------------------------------------------------------------");
                Penumpang penumpang = new Penumpang(nama, umur, hamil);
                bus1.naikPenumpang(penumpang);
                bus1.toString();
                bus1.getJumlahPenumpangBiasa();
                bus1.getJumlahPenumpangPrioritas();
                bus1.getJumTotalPenumpang();
                System.out.println("--------------------------------------------------------------------------");

            }else if (pilihan == 2){
                System.out.print("\nMasukan Nama Penumpang Yang Akan Diturunkan : ");
                String nama = input.next();
                bus1.turunkanPenumpang(nama);
                bus1.toString();
                System.out.println("--------------------------------------------");
                main = true;
            }else if (pilihan == 3){
                bus1.toString();
                System.out.println("---------------------------------------------");
                System.out.println("");
                main = true;
            }else if (pilihan == 4){
                System.exit(0);
            }else{
                System.out.println("Pilihan Tidak Sesuai!");
            }
        }
    }
}



