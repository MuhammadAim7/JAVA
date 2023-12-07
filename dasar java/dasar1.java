// sebagai input data secara otomatis
import java.util.Scanner;

public class dasar1 {
    public static void main(String[] args) {

        // mendefinisikan variabel
        String nama_siswa;
        int nis;

        // input data
        try(
        Scanner input = new Scanner(System.in)){
        System.out.print("Masukan Nama: ");
        nama_siswa = input.nextLine();
        System.out.print("===================================");
        System.out.print("Masukan NO NIS: ");
        nis = input.nextInt();
        }
        // output data
        System.out.println("==================================");
        System.out.println("nama kamu = "+ nama_siswa);
        System.out.println("NIS = "+ nis);
        

    }
}