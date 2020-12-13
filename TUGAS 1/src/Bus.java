<<<<<<< HEAD
import java.util.ArrayList;
import java.util.*;

public class Bus{
    ArrayList<Penumpang> penumpangBiasa1;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;

    Scanner input = new Scanner(System.in);

    public Bus(){

        penumpangBiasa1 =  new ArrayList<Penumpang>();
        penumpangPrioritas =  new ArrayList<Penumpang>();
        semuaPenumpang = new ArrayList<Penumpang>();
    }


    public ArrayList<Penumpang> getPenumpangBiasa(){

        for(Penumpang penumpang:penumpangBiasa1)
        {
            penumpang.getNama();
        }
        return penumpangBiasa1;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {

        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumBiasa = penumpangBiasa1.size();
        System.out.println("\nPenumpang Yang Duduk di Kursi Biasa, jumlahnya : " +jumBiasa);
        return jumBiasa;
    }

    public int getJumlahPenumpangPrioritas(){
        int jumPrio  = penumpangPrioritas.size();
        System.out.println("Penumpang Yang Duduk di Kursi Prioritas, jumlahnya :  " +jumPrio );
        return jumPrio ;
    }

    public int getJumTotalPenumpang(){
        int total  = penumpangBiasa1.size() + penumpangPrioritas.size();
        System.out.println("Banyaknya Penumpang di Dalam Bus = " +total );
        return total ;
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int biasa=4,  prio=2;;

        if((penumpangPrioritas.size() < prio ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Prioritas!");
            return penumpangPrioritas.add(penumpang);
        }else if((penumpangBiasa1.size() < biasa ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Biasa!");
            return penumpangBiasa1.add(penumpang);
        }
        else if(penumpangBiasa1.size() < biasa ){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Biasa!");
            return penumpangBiasa1.add(penumpang);
        } else{
            System.out.println("Penumpang GAGAL ditambahkan!");
            System.out.print("Tidak ada kursi yang tersedia!");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){

        for (int i = 0; i < penumpangBiasa1.size(); i ++) {
            if(nama.equals(penumpangBiasa1.get(i).getNama())){
                penumpangBiasa1.remove(i);
                System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
                return penumpangBiasa1.equals(nama);
            }else{
                System.out.println("Tidak Ada penumpang yang dimaksudkan");
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i ++) {
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
                penumpangPrioritas.remove(i);
                System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
                return penumpangPrioritas.equals(nama);
            }else{
                System.out.println("Nama Penumpang Yang Dimaksud Tidak Ada di Dalam Bus");
                return false;
            }
        }return penumpangPrioritas.equals(nama);
    }

    public ArrayList<Penumpang> semuaPenumpang()
    {
        semuaPenumpang = penumpangBiasa1;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.print("semua penumpang : ");
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }

        return semuaPenumpang;
    }

    public String toString(){
        String result1 = " ";
        String result2 = " ";

        for(Penumpang penumpang : penumpangBiasa1) {
            result1 += (""+penumpang.getNama().toString()+ ", ");

        }
        for(Penumpang penumpang : penumpangPrioritas) {
            result2 += (""+penumpang.getNama().toString()+ ", ");

        }

        if(penumpangBiasa1.isEmpty() == true ){
            System.out.println("\nTempat Duduk Penumpang Biasa Masih kosong") ;
        }else{
            System.out.println("\nDaftar Penumpang Yang Duduk di Kursi Biasa  = " +result1 );
        }

        if(penumpangPrioritas.isEmpty() == true ){
            System.out.println("Tempat Duduk Penumpang Prioritas Masih kosong") ;
        }else{
            System.out.println("Daftar Penumpang Yang Duduk di Kursi Prioritas = " +result2);
        }

        return " Nama penumpang biasa = "+result1+"Nama penumpang prioritas = "+result2+"\n";
    }
=======
import java.util.ArrayList;
import java.util.*;

public class Bus{
    ArrayList<Penumpang> penumpangBiasa1;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;

    Scanner input = new Scanner(System.in);

    public Bus(){

        penumpangBiasa1 =  new ArrayList<Penumpang>();
        penumpangPrioritas =  new ArrayList<Penumpang>();
        semuaPenumpang = new ArrayList<Penumpang>();
    }


    public ArrayList<Penumpang> getPenumpangBiasa(){

        for(Penumpang penumpang:penumpangBiasa1)
        {
            penumpang.getNama();
        }
        return penumpangBiasa1;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {

        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumBiasa = penumpangBiasa1.size();
        System.out.println("\nPenumpang Yang Duduk di Kursi Biasa, jumlahnya : " +jumBiasa);
        return jumBiasa;
    }

    public int getJumlahPenumpangPrioritas(){
        int jumPrio  = penumpangPrioritas.size();
        System.out.println("Penumpang Yang Duduk di Kursi Prioritas, jumlahnya :  " +jumPrio );
        return jumPrio ;
    }

    public int getJumTotalPenumpang(){
        int total  = penumpangBiasa1.size() + penumpangPrioritas.size();
        System.out.println("Banyaknya Penumpang di Dalam Bus = " +total );
        return total ;
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int biasa=4,  prio=2;;

        if((penumpangPrioritas.size() < prio ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Prioritas!");
            return penumpangPrioritas.add(penumpang);
        }else if((penumpangBiasa1.size() < biasa ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Biasa!");
            return penumpangBiasa1.add(penumpang);
        }
        else if(penumpangBiasa1.size() < biasa ){
            System.out.println("Penumpang Bernama "+penumpang.getNama()+" Telah Duduk di Kursi Biasa!");
            return penumpangBiasa1.add(penumpang);
        } else{
            System.out.println("Penumpang GAGAL ditambahkan!");
            System.out.print("Tidak ada kursi yang tersedia!");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){

        for (int i = 0; i < penumpangBiasa1.size(); i ++) {
            if(nama.equals(penumpangBiasa1.get(i).getNama())){
                penumpangBiasa1.remove(i);
                System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
                return penumpangBiasa1.equals(nama);
            }else{
                System.out.println("Tidak Ada penumpang yang dimaksudkan");
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i ++) {
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
                penumpangPrioritas.remove(i);
                System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
                return penumpangPrioritas.equals(nama);
            }else{
                System.out.println("Nama Penumpang Yang Dimaksud Tidak Ada di Dalam Bus");
                return false;
            }
        }return penumpangPrioritas.equals(nama);
    }

    public ArrayList<Penumpang> semuaPenumpang()
    {
        semuaPenumpang = penumpangBiasa1;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.print("semua penumpang : ");
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }

        return semuaPenumpang;
    }

    public String toString(){
        String result1 = " ";
        String result2 = " ";

        for(Penumpang penumpang : penumpangBiasa1) {
            result1 += (""+penumpang.getNama().toString()+ ", ");

        }
        for(Penumpang penumpang : penumpangPrioritas) {
            result2 += (""+penumpang.getNama().toString()+ ", ");

        }

        if(penumpangBiasa1.isEmpty() == true ){
            System.out.println("\nTempat Duduk Penumpang Biasa Masih kosong") ;
        }else{
            System.out.println("\nDaftar Penumpang Yang Duduk di Kursi Biasa  = " +result1 );
        }

        if(penumpangPrioritas.isEmpty() == true ){
            System.out.println("Tempat Duduk Penumpang Prioritas Masih kosong") ;
        }else{
            System.out.println("Daftar Penumpang Yang Duduk di Kursi Prioritas = " +result2);
        }

        return " Nama penumpang biasa = "+result1+"Nama penumpang prioritas = "+result2+"\n";
    }
>>>>>>> afa6707a0583d4fa8f5f201e7e95dd27eeaacdc0
}