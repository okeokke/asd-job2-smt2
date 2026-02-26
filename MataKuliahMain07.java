public class MataKuliahMain07 {
  public static void main(String[] args) {
    MataKuliah07 mk1=new MataKuliah07();
    mk1.kodeMK="JR_205_VVVF";
    mk1.nama="Praktikum Dasar Pemrograman";
    mk1.sks=2;
    mk1.jumlahJam=4;
    
    MataKuliah07 mk2=new MataKuliah07("JR_209_GTO", "Bahasa Inggris", 1, 2);
    
    System.out.println("== DATA AWAL ==");
    System.out.println("Mata Kuliah 1:");
    mk1.tampilInformasi();
    System.out.println();
    System.out.println("Mata Kuliah 2:");
    mk2.tampilInformasi();
    System.out.println();

    System.out.println("Melakukan perubahan pada Mata Kuliah 1...");
    mk1.ubahSKS(4);
    mk1.tambahJam(4);
    mk1.kurangiJam(10);
    System.out.println();
    System.out.println("Mengurangi jam dengan jumlah yang mencukupi...");
    mk1.kurangiJam(2);

    System.out.println();
    System.out.println();

    System.out.println("Melakukan perubahan pada Mata Kuliah 2...");
    mk2.ubahSKS(2);
    mk2.tambahJam(4);
    mk2.kurangiJam(2);
    System.out.println();

    System.out.println("== DATA AKHIR SETELAH PERUBAHAN ==");
    mk1.tampilInformasi();
    System.out.println();
    mk2.tampilInformasi();
  }
}