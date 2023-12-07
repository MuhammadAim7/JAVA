class Motor {
    protected String nama = "klx";        // Vehicle attribute
    protected String warna = "merah";        // Vehicle attribute
    protected String fungsi_umu = "segala medan kecepatan max 130km";        // Vehicle attribute
    public void honda() {  
        Motor montor= new Motor();                  // Vehicle method
      System.out.println("nama montor "+montor.nama+", warna "+ montor.warna+", kererangan "+montor.fungsi_umu+"");
    }
  }
  
  class Car extends Motor {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
      Motor montor  = new Motor();

      montor.honda();
  
    }
  }
  