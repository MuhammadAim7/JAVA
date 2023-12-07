package dev.project.matkul;

public class linkaran {
          double PI = Math.PI;
          double r;

          linkaran(double r){
               this.r = r;
          }

double hasil_luas(){
double luas = PI * (this.r * this.r);
return luas;
}
     
public static void name(String[] args) throws Exception 
{
     linkaran lingkaran = new linkaran(5);
     System.out.println(lingkaran.hasil_luas());
}
}
