package constructors ;

// Class 1
public class constructors {
    String name; 
    int nm; 
    String prodi;
    Float nilai ; 
    int usia;
  
    public constructors(String nama,int nim,String jurusan,Float ipk,int umur) {
        name = nama;
      nm = nim;
      prodi = jurusan;
      nilai = ipk;
      usia = umur;

    }
  
    public static void main(String[] args) {
      constructors id = new constructors("Muhammad Aim", 24210002, "Teknik INformatika", (float) 3.56 ,19);
      System.out.println("+========================================+");
      System.out.println("|           CLASS MAHASISWA              |");
      System.out.println("+========================================+");
      System.out.println( "| Nama :" + id.name + "\n"+ "| Nim  :"+ id.nm+"\n" +"| prodi:" + id.prodi +"\n" + "| ipk  :"+ id.nilai);
      System.out.println("+========================================+");
    }
  }

// Class 2
  class handphone{
    String brand; 
    int type; 
    float harga;
  
    public handphone(String brand,int type,Float harga) {
       this.brand = brand;
       this.type=type;
       this.harga=harga;

    }
  
    public static void main(String[] args) {
      handphone id = new handphone("Iphone", 11,(float) 6.7);
      System.out.println("+========================================+");
      System.out.println("|            CLASS HANDPHONE             |");
      System.out.println("+========================================+");
      System.out.println( "| Brand :" + id.brand + "\n"+ "| type :"+ id.type+"\n" +"| harga:" +id.harga);
      System.out.println("+========================================+");
    }
  }

// Class 3

  class pemain_bola{
    String name; 
    int no_punggung; 
    float rating;
  
    public pemain_bola(String nama,int no_punggung,Float rating) {
       this.name = nama;
       this.no_punggung=no_punggung;
       this.rating=rating;

    }
  
    public static void main(String[] args) {
      pemain_bola id = new pemain_bola("Herry Megwayer", 5,(float) 9.7);
      System.out.println("+========================================+");
      System.out.println("|           CLASS PEMAIN BOLA            |");
      System.out.println("+========================================+");
      System.out.println( "| Nama        :" + id.name + "\n"+ "| No punggung :"+ id.no_punggung+"\n" +"| Ratting     :" +id.rating);
      System.out.println("+========================================+");
    }
  }
  
// Class 4
  class Motor{
    String merek ; 
    int cc; 
    float kecepatan;
  
    public Motor(String merek,int cc,Float kecepatan) {
       this.merek= merek;
       this.cc=cc;
       this.kecepatan=kecepatan;

    }
    
  
    public static void main(String[] args) {
      Motor id = new Motor("Supra x", 125,(float) 130.2);
      System.out.println("+========================================+");
      System.out.println("|              CLASS MOTOR               |");
      System.out.println("+========================================+");
      System.out.println( "| Merek Motor   :" + id.merek + "\n"+ "| cc            :"+ id.cc+"\n" +"| Max Kecepatan :" +id.kecepatan);
      System.out.println("+========================================+");
    }
  }
  
// Class 5
  class Mata_uang{
    String jenis ; 
    int jumlah; 
    float tukar; 
  
    public Mata_uang(String jenis,int jumlah,Float tukar) {
       this.jenis= jenis;
       this.jumlah=jumlah;
       this.tukar=tukar;

    }
  
    public static void main(String[] args) {
      Mata_uang id = new Mata_uang("Dolar AS",1,(float) 15.523);
      System.out.println("+========================================+");
      System.out.println("|          CLASS MATA UANG               |");
      System.out.println("+========================================+");
      System.out.println( "| Jenis Mata Uang   :" + id.jenis + "\n"+ "| Jumlah mata uang  :"+ id.jumlah+"\n" +"| Nilai tukar ke Rp :" +id.tukar);
      System.out.println("+========================================+");
    }
  }
  