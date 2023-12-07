public class Pahlawan {
    String  nama;
    int hp = 100;
    
    public void serangMusuh(Musuh musuh) {
        musuh.hp -= 10;
        musuh.nama="thanos";
        System.out.println("Pahlawan menyerang "+musuh.nama+" , HP "+musuh.nama+" berkurang 10");
    }

    public void diserangMusuh(Musuh musuh) {
        hp -= 5;
        musuh.nama="thanos";
        System.out.println(musuh.nama+" menyerang pahlawan, HP pahlawan berkurang 5");
    }
}

 class Musuh {
    String nama;
    int hp = 100;

    public void serangPahlawan(Pahlawan pahlawan) {
        pahlawan.hp -= 5;
        pahlawan.nama="dr.strange";
        System.out.println("Musuh menyerang "+pahlawan.nama+" , HP "+pahlawan.nama+ " berkurang 5");
    }

    public void diserangPahlawan(Pahlawan pahlawan) {
        hp -= 10;
        pahlawan.nama="dr.strange";
        System.out.println(pahlawan.nama+" menyerang musuh, HP musuh berkurang 10");
    }
}

 class Main {
    public static void main(String[] args) {
        Pahlawan pahlawan = new Pahlawan();
        Musuh musuh = new Musuh();

        pahlawan.nama="dr.strange";
        pahlawan.serangMusuh(musuh);
        musuh.serangPahlawan(pahlawan);
        musuh.nama="Thanos";

        System.out.println("HP Pahlawan "+pahlawan.nama +"= " + pahlawan.hp);
        System.out.println("HP Musuh "+musuh.nama+"= " + musuh.hp);
    }
}