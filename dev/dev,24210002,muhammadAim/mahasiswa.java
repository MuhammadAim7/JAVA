
public class mahasiswa {
     String nama;
     int nim; 
     String jurusan;
      double ipk;
  int umur;
   
   public static void main(String[] args){
     //membuat object
    mahasiswa mahasiswa1 =new mahasiswa();

    /*memanggil atribut dan memberi nilai */
    mahasiswa1.nama="Muhammad Aim";
    mahasiswa1.nim=24210002;
    mahasiswa1.jurusan="TEKINIK Informatika";
    mahasiswa1.ipk=4.0;
    mahasiswa1.umur=19;
    System.out.println("nama :"+ mahasiswa1.nama);
    System.out.println("nim  :"+ mahasiswa1.nim);
    System.out.println("prodi:"+ mahasiswa1.jurusan);
    System.out.println("ipk  :"+ mahasiswa1.ipk);
    System.out.println("umur :"+ mahasiswa1.umur);
    
    System.out.println("=================================");

    mahasiswa mahasiswa2 =new mahasiswa();
    mahasiswa2.nama="Muhammad qotimun niam";
    mahasiswa2.nim=24210001;
    mahasiswa2.jurusan="TEKINIK Informatika";
    mahasiswa2.ipk=4.0;
    mahasiswa2.umur=23;
    System.out.println("nama :"+ mahasiswa2.nama);
    System.out.println("nim  :"+ mahasiswa2.nim);
    System.out.println("prodi:"+ mahasiswa2.jurusan);
    System.out.println("ipk  :"+ mahasiswa2.ipk);
    System.out.println("umur :"+ mahasiswa2.umur);
    
    System.out.println("=================================");

    mahasiswa mahasiswa3 =new mahasiswa();
    mahasiswa3.nama="yudi andre";
    mahasiswa3.nim=24210006;
    mahasiswa3.jurusan="TEKINIK Informatika";
    mahasiswa3.ipk=4.0;
    mahasiswa3.umur=20;
    System.out.println("nama :"+ mahasiswa3.nama);
    System.out.println("nim  :"+ mahasiswa3.nim);
    System.out.println("prodi:"+ mahasiswa3.jurusan);
    System.out.println("ipk  :"+ mahasiswa3.ipk);
    System.out.println("umur :"+ mahasiswa3.umur);

    System.out.println("=================================");
    
    mahasiswa mahasiswa4 =new mahasiswa();
    mahasiswa4.nama="febriyan ";
    mahasiswa4.nim=24210003;
    mahasiswa4.jurusan="TEKINIK Informatika";
    mahasiswa4.ipk=4.0;
    mahasiswa4.umur=18;
    System.out.println("nama :"+ mahasiswa4.nama);
    System.out.println("nim  :"+ mahasiswa4.nim);
    System.out.println("prodi:"+ mahasiswa4.jurusan);
    System.out.println("ipk  :"+ mahasiswa4.ipk);
    System.out.println("umur :"+ mahasiswa4.umur);

    System.out.println("=================================");

    
    mahasiswa mahasiswa5 =new mahasiswa();
    mahasiswa5.nama="ester dafida";
    mahasiswa5.nim=24210008;
    mahasiswa5.jurusan="TEKINIK Informatika";
    mahasiswa5.ipk=4.0;
    mahasiswa5.umur=19;
  
    System.out.println("nama :"+ mahasiswa5.nama);
    System.out.println("nim  :"+ mahasiswa5.nim);
    System.out.println("prodi:"+ mahasiswa5.jurusan);
    System.out.println("ipk  :"+ mahasiswa5.ipk);
    System.out.println("umur :"+ mahasiswa5.umur);
    
}
}


