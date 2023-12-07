class BangunDatar {
	
	public void luas(){
		
	}
	
	public void keliling(){
		
	}
}

class Persegi extends BangunDatar {
	
	int sisi = 5;
	
	public void luas(){
		System.out.println(sisi*sisi);
	}
	
	public void keliling(){
		System.out.println(4*sisi);
	}
}

class Lingkaran extends BangunDatar {
	
	int jariJari = 3;
	
	public void luas(){
		System.out.println(3.14*jariJari*jariJari);
	}
	
	public void keliling(){
		System.out.println(2*3.14*jariJari);
	}
}

class PersegiPanjang extends BangunDatar {
	
	int lebar = 10;
	int tinggi = 2;
	
	public void luas(){
		System.out.println(lebar*tinggi);
	}
	
	public void keliling(){
		System.out.println(2*(lebar+tinggi));
	}
}

class Segitiga extends BangunDatar {
	
	int alas = 4;
	int tinggi = 8;
	
	public void luas(){
		System.out.println(0.5*alas*tinggi);
	}
	
	public void keliling(){
		System.out.println(alas+tinggi+Math.sqrt((alas*alas)+(tinggi*tinggi)));
	}
}

 class HitungLuas {
	public static void main(String[] args){
		
		Persegi persegi = new Persegi();
		System.out.println("Luas Persegi : ");
		persegi.luas();
		System.out.println("Keliling Persegi : ");
		persegi.keliling();
		System.out.println("============================");
		
		Lingkaran lingkaran = new Lingkaran();
		System.out.println("Luas Lingkaran : ");
		lingkaran.luas();
		System.out.println("Keliling Lingkaran : ");
		lingkaran.keliling();
		System.out.println("============================");
		
		PersegiPanjang persegiPanjang = new PersegiPanjang();
		System.out.println("Luas Persegi Panjang : ");
		persegiPanjang.luas();
		System.out.println("Keliling Persegi Panjang : ");
		persegiPanjang.keliling();
		System.out.println("============================");
		
		Segitiga segitiga = new Segitiga();
		System.out.println("Luas Segitiga : ");
		segitiga.luas();
		System.out.println("Keliling Segitiga : ");
		segitiga.keliling();
		System.out.println("============================");
		
	}
}