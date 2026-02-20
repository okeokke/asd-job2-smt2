public class Mahasiswa07 { 
  String nama;
  String nim;
  String kelas;
  double ipk;
  void tampilkanInformasi(){
    System.out.println("Nama : ");
    System.out.println("NIM : ");
    System.out.println("IPK : ");
    System.out.println("Kelas : ");
  }
  void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
  }
  void updateIPK(double ipkBaru){
    ipk = ipkBaru;
  }
  String nilaiKinerja(double ipk){
    if (ipk >= 3.5) {
      return "Kinerja sangat baik";
    } else if (ipk >= 3.0) {
      return "Kinerja baik";
    } else if (ipk >= 2.0) {
      return "Kinerja cukup";
    } else {
      return "Kinerja kurang";
    }
  }
}


