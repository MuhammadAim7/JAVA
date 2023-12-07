import java.util.Scanner;
public class App {
String nama;
double berat;

    public static void main(String[] args) throws Exception {
        String nama_barang;
        double berat;
        int diskon;
        int ongkir,jumlah;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Barang: ");
        nama_barang = input.nextLine();
        System.out.print("Masukan berat: ");
        berat = input.nextDouble();
 
        App jasaKirim = new App();
        jasaKirim.nama=nama_barang;
        jasaKirim.berat=berat;
        

        if (jasaKirim.berat <= 5){
           ongkir = 5000;
           System.out.println("\n============================\n");
           System.out.println("Nama Brang = " +jasaKirim.nama);
           System.out.println("Berat Barang = " +jasaKirim.berat+"kg");
           System.out.println("jumlah ongkir = Rp" +ongkir);
        } else if (jasaKirim.berat <=10){
           ongkir= (int) ((berat - 5)*2000+5000);
           System.out.println("\n============================\n");
           System.out.println("Nama Brang = " +jasaKirim.nama);
           System.out.println("Berat Barang = " +jasaKirim.berat+"kg");
           System.out.println("jumlah ongkir = Rp" +ongkir);
        }  else if (jasaKirim.berat >=11){
            ongkir= (int) ((((berat - 5)*2000)+5000));
            diskon=diskon(ongkir);
            jumlah= jumlah(ongkir, diskon);
           System.out.println("\n============================\n");
           System.out.println("Nama Brang = " +jasaKirim.nama);
           System.out.println("Berat Barang = " +jasaKirim.berat+"kg");
            System.out.println("jumlah ongkir = Rp" +ongkir);
            System.out.println("Dapat diskon 10%= Rp" +diskon);
            System.out.println("jumlah ongkir total = Rp"+jumlah);

        } 
    }
    private static int diskon(double ongkir){
        int diskon= (int) (ongkir*10/100);
        return diskon;
        
    }
    private static int jumlah(int ongkir,  int diskon) {
        int jumlah = ongkir-diskon;
        return jumlah;
    }
}
