import java.util.Scanner;
public class mahasiswaaksi {
     public static void main(String[] args){
          //membuat object
          try(
          Scanner input = new Scanner(System.in)){
        String nama,prodi;
        int umur,nim;
        double ipk;
          
        System.out.print("Masukan nama: ");
        nama = input.nextLine();

        System.out.print("Masukan jurusan: ");
        prodi = input.nextLine();

        System.out.print("Masukan nim: ");
        nim = input.nextInt();

        System.out.print("Masukan ipk: ");
        ipk =input.nextDouble();

        System.out.print("Masukan umur: ");
        umur =input.nextInt();
     
        mahasiswa mahasiswa1 = new mahasiswa();
         /*memanggil atribut dan memberi nilai */
         mahasiswa1.nama= nama;
         mahasiswa1.nim= nim;
         mahasiswa1.jurusan= prodi;
         mahasiswa1.ipk= ipk;
         mahasiswa1.umur=umur;

          
         System.out.println("nama :"+ mahasiswa1.nama);
         System.out.println("nim  :"+ mahasiswa1.nim);
         System.out.println("prodi:"+ mahasiswa1.jurusan);
         System.out.println("ipk  :"+ mahasiswa1.ipk);
         System.out.println("umur :"+ mahasiswa1.umur);
          System.out.println("==============================");
          System.out.println("nama :"+ mahasiswa1.nama + ", nim :"+ mahasiswa1.nim + ", prodi :"+ mahasiswa1.jurusan + ", ipk :"+ mahasiswa1.ipk + ", umur :"+mahasiswa1.umur);
          System.out.println("=================================================================================");
     }
}
}
