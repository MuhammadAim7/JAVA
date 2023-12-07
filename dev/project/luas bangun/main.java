import java.util.Scanner;
public class main {
     public static void main(String[] args) {
try(
     Scanner input = new Scanner(System.in)){
          int opsi;
          System.out.println("=========================================");
          System.out.println("| Hitung Luas dan Keliling Bangun Ruang |");
          System.out.println("=========================================");
          System.out.println("1. KUBUS");
          System.out.println("2. BALOK");
          System.out.println("=========================================");
          System.out.print( "Masukan code : ");
          opsi = input.nextInt();
          bangun_ruang main = new bangun_ruang();
          main.opsi=opsi;
     
          if(opsi==1){

                 aksi run = new aksi();
                 run.main();
          }else{
               aksi run = new aksi();
               run.persegi_panjang();
          }
}}};
