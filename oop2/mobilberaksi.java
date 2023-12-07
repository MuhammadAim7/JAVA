public class mobilberaksi {
     public static void main(String[] args){
          //membuat object
          mobil mobilku = new mobil();

          /*memanggil atribut dan memberi nilai */
          mobilku.warna="merah";
          mobilku.tahunProduksi=2022;
          mobilku.type="fortuner";
          mobilku.bbm="Pertalite";
          System.out.println("warna :"+ mobilku.warna);
          System.out.println("tahun :"+ mobilku.tahunProduksi);
          System.out.println("type  :"+ mobilku.type);
          System.out.println("bbm   :"+ mobilku.bbm);
     }
}
