public class Dosen07 {
  String idDosen;
  String nama;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;

  public Dosen07() {
  }

  public Dosen07(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
    this.idDosen=idDosen;
    this.nama=nama;
    this.statusAktif=statusAktif;
    this.tahunBergabung=tahunBergabung;
    this.bidangKeahlian=bidangKeahlian;
  }

  public void tampilInformasi() {
    System.out.println("ID Dosen : "+idDosen);
    System.out.println("Nama : "+nama);
    System.out.println("Status Aktif : "+(statusAktif ? "Aktif" : "Tidak Aktif"));
    System.out.println("Tahun Bergabung : "+tahunBergabung);
    System.out.println("Bidang Keahlian : "+bidangKeahlian);
  }

  public void setStatusAktif(boolean statusAktif) {
    this.statusAktif = statusAktif;
  }

  public int hitungMasaKerja(int thnSkrg) {
    return thnSkrg - tahunBergabung;
  }

  public void ubahKeahlian(String keahlianBaru) {
    this.bidangKeahlian = keahlianBaru;
  }






}
