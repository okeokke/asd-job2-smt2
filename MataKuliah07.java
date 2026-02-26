public class MataKuliah07 {
  String kodeMK;
  String nama;
  int sks;
  int jumlahJam;

  public MataKuliah07() {
  }

  public MataKuliah07(String kodeMK, String nama, int sks, int jumlahJam) {
    this.kodeMK=kodeMK;
    this.nama=nama;
    this.sks=sks;
    this.jumlahJam=jumlahJam;
  }

  public void tampilInformasi() {
    System.out.println("Kode MK: "+kodeMK);
    System.out.println("Nama MK: "+nama);
    System.out.println("SKS: "+sks);
    System.out.println("Jumlah Jam: "+jumlahJam);
  }

  public void ubahSKS(int sksBaru) {
    sks=sksBaru;
    System.out.println("SKS berhasil diubah menjadi "+sks+" SKS.");
  }

  public void tambahJam(int jam) {
    jumlahJam+=jam;
    System.out.println("Jumlah jam berhasil ditambah menjadi "+jumlahJam+" jam.");
  }

  public void kurangiJam(int jam) {
    if (jumlahJam >= jam) {
      jumlahJam -= jam;
      System.out.println("Jumlah jam berhasil dikurangi menjadi "+jumlahJam+" jam.");
    } else {
      System.out.println("Pengurangan gagal. Jumlah jam tidak mencukupi.");
    }
  }


}
