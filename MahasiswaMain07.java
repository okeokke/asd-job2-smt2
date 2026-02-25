public class MahasiswaMain07 {
  public static void main(String[] args) {
    Mahasiswa07 mhs1 = new Mahasiswa07();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIPK(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa07 mhs2 = new Mahasiswa07("Rizky Pratama", "2241720172", "TI 2C", 3.20);
    mhs2.updateIPK(3.30);
    mhs2.tampilkanInformasi();

    Mahasiswa07 mhsAbil = new Mahasiswa07("Ghulam Ahmad Billah", "254107060110", "MMB 1B", 3.43);
    mhsAbil.updateIPK(3.84);
    mhsAbil.ubahKelas("SIB 1F"); 
    mhsAbil.tampilkanInformasi();
  }
}