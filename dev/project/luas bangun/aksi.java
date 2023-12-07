import java.util.Scanner;
public class aksi {
     public void main(){   
         float rusuk,Keliling,Luas;
         int opsi;  
         try(
              Scanner input = new Scanner(System.in)){
               System.out.println("=========================================");
               System.out.println("|     Hitung Luas dan Keliling KUBUS    |");
               System.out.println("=========================================");
               System.out.println("1 Menghitung Luas ");
               System.out.println("2 Menghitung Keliling ");
               System.out.println("=========================================");
                   System.out.println("Masukan opsi: ");
                   opsi = input.nextInt();
                   System.out.println("Masukan nilai rusuk : ");
                   rusuk = input.nextFloat();
                   
                   bangun_ruang bangun1 = new bangun_ruang();
                    /*memanggil atribut dan memberi nilai */
                    bangun1.opsi=opsi; 
                    bangun1.rusuk= rusuk;
                    Keliling=12*rusuk; 
                    bangun1.Keliling= Keliling;
                    Luas=6* (rusuk*rusuk);
                    bangun1.Luas= Luas;
                    if (opsi==1){
                         System.out.print("Luas KUBUS sama dengan :" +Luas );     
                         
                    }else{
                         System.out.print("Keliling KUBUS sama dengan :" +Keliling );
                    }             

     }
}

public  void persegi_panjang() {
     float panjang,lebar, tinggi,Keliling,Luas;
         int opsi;
     try(
              Scanner input = new Scanner(System.in)){
               System.out.println("=========================================");
               System.out.println("|    Hitung Luas dan Keliling BALOK     |");
               System.out.println("=========================================");
               System.out.println("1 Menghitung Luas ");
               System.out.println("2 Menghitung Keliling ");
               System.out.println("=========================================");
               System.out.println("Masukan opsi: ");
               opsi = input.nextInt();
               System.out.println("=========================================");
               System.out.println("|            Masukan Nilai              |");
               System.out.println("=========================================");
               System.out.println("Masukan panjang balok: ");
               panjang= input.nextFloat();
               System.out.println("Masukan lebar balok  : ");
               lebar= input.nextFloat();
               System.out.println("Masukan tinggi balok : ");
               tinggi= input.nextFloat();
               System.out.println("=========================================");

                   bangun_ruang bangun1 = new bangun_ruang();
                   /*memanggil atribut dan memberi nilai */
                   bangun1.opsi=opsi; 
                   bangun1.panjang=panjang;
                   bangun1.lebar=lebar;
                   bangun1.tinggi=tinggi;

                   Keliling=4*(panjang+tinggi+lebar); 
               
                   Luas=2* ((panjang*lebar)*(tinggi*lebar)*(panjang*tinggi));
                   
                   if (opsi==1){
                        System.out.print("Luas BALOK sama dengan :" +Luas );     
                        
                   }else {
                        System.out.print("Keliling BALOK sama dengan :" +Keliling );
               }
     }}}
