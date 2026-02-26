public class DosenMain07 {
  public static void main(String[] args) {
    System.out.println("== Data Awal ==");
    System.out.println("Dosen 1 :");
    Dosen07 dosen1 = new Dosen07();
    dosen1.nama="Dr. Andi";
    dosen1.idDosen="CC206";
    dosen1.statusAktif=true;
    dosen1.tahunBergabung=2016;
    dosen1.bidangKeahlian="Matematika";
    dosen1.tampilInformasi();
    System.out.println("Masa Kerja Dosen 1 : "+dosen1.hitungMasaKerja(2026)+" tahun");
    System.out.println();
    
    System.out.println("Dosen 2 :");
    Dosen07 dosen2 = new Dosen07("CC203", "Dr. Budi", false, 2019, "Fisika");
    dosen2.tampilInformasi();
    System.out.println();
    
    System.out.println("== Update Data ==");
    dosen1.setStatusAktif(false);
    dosen1.ubahKeahlian("Statistika");
    System.out.println("Dosen 1 setelah update :");
    dosen1.tampilInformasi();
    System.out.println("Masa Kerja Dosen 1 : "+dosen1.hitungMasaKerja(2026)+" tahun");
    System.out.println();

    dosen2.setStatusAktif(true);
    dosen2.ubahKeahlian("Aerodinamika");
    System.out.println("Dosen 2 setelah update :");
    dosen2.tampilInformasi();
    System.out.println("Masa Kerja Dosen 2 : "+dosen2.hitungMasaKerja(2026)+" tahun");
  }
}
