import java.util.Scanner;
public class buku_beraksi {
     public static void main(String[] args){
try(
     
     Scanner input = new Scanner(System.in)){
               int tahun_terbit;
               String judul,pengarang,penerbit,id;

               System.out.print( "Masukan id buku: ");
               id = input.nextLine();
       
               System.out.print( "Masukan judul: ");
               judul = input.nextLine();
       
               System.out.print("Masukan pengarang: ");
               pengarang = input.nextLine();
       
               System.out.print("Masukan penerbit: ");
               penerbit =input.nextLine();
       
               System.out.print("Masukan tahun terbit: ");
               tahun_terbit =input.nextInt(); 
               
               buku buku1 = new buku();
               buku1.id=id;
               buku1.judul=judul;
               buku1.pengarang=pengarang;
               buku1.penerbit=penerbit;
               buku1.tahun_terbit=tahun_terbit;

               System.out.println("id :"+buku1.id );
               System.out.println("jadul  :"+ buku1.judul);
               System.out.println("pengarang:"+ buku1.pengarang);
               System.out.println("penerbit  :"+ buku1.penerbit);
               System.out.println("tahun terbit :"+ buku1.tahun_terbit);
                System.out.println("==============================");

          }
     
}
}