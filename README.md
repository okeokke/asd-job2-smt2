
# [Tugas](#tugas)  
# [Daftar_Percobaan](#daftar_percobaan-1)  

# TUGAS
  
### TUGAS 1    
Soal :  
Diberikan class diagram dari class MataKuliah sebagai berikut:  
|MataKuliah|  
|-|
|**Atribut**|  
|`kodeMK: String`|  
|`nama: String`|  
|`sks: int`|  
|`jumlahJam: int`|  
|**Method**|
|`tampilInformasi()`|  
|`ubahSKS(sksBaru: int)`|  
|`tambahJam(jam: int)`|  
|`kurangiJam(jam: int)`|  

Buat program untuk mengimplementasikan class MataKuliah berdasarkan class diagram di atas, yang terdiri dari:
- Class MataKuliah (MataKuliah<NoAbsen>.java)
- Class MataKuliahMain (MataKuliahMain<NoAbsen>.java)  

Pada class MataKuliahMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada class MataKuliah.   

Penjelasan dari atribut dan method pada class MataKuliah tersebut adalah sebagai berikut:  
a. Atribut  
- `kodeMK (String)`: kode unik untuk mata kuliah.
- `sks (int)`: SKS (Satuan Kredit Semester)
- `nama (String)`: nama lengkap dari mata kuliah
- `jumlahJam (int)`: jumlah total jam pertemuan per minggu untuk mata kuliah  

b. Method  
- `tampilInformasi()`: method ini digunakan untuk menampilkan semua informasi yang berkaitan dengan mata kuliah.  
- `ubahSKS(int sksBaru)`: method ini memungkinkan pengubahan nilai SKS untuk mata kuliah. Setelah mengubah nilai, method ini memberi tahu pengguna bahwa SKS telah diubah.  
- `tambahJam(int jam)`: method ini menambahkan jumlah jam tambahan ke jumlah jam yang sudah ada untuk mata kuliah.  
- `kurangiJam(int jam)`: method ini berfungsi untuk mengurangi jumlah jam dari mata kuliah. Sebelum mengurangi, method ini melakukan pengecekan untuk memastikan bahwa jumlah jam yang tersisa cukup untuk dikurangi. Jika jumlah jam tidak mencukupi (jumlah jam awal lebih kecil dari jam pengurang), method ini akan memberi tahu pengguna bahwa pengurangan tidak dapat dilakukan. Jika pengurangan berhasil, method ini mengupdate jumlah jam dan mencetak nilai jumlah jam yang baru.



---  

### TUGAS 2  
Soal :  
Diberikan class diagram dari class Dosen sebagai berikut:  

|Dosen|
|-|
|**Atribut**|
|`idDosen: String`|
|`nama: String`|
|`statusAktif: boolean`|
|`tahunBergabung: int`|
|`bidangKeahlian: String`|
|**Method**|
|`tampilInformasi(): void`|
|`setStatusAktif(status: boolean): void`|
|`hitungMasaKerja(thnSkrg: int): int`|
|`ubahKeahlian(bidang: String): void`|

Buat program untuk mengimplementasikan class Dosen berdasarkan class diagram di atas, yang terdiri dari:
- Class Dosen (Dosen<NoAbsen>.java)
- Class DosenMain (DosenMain<NoAbsen>.java)

Pada class DosenMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada class Dosen.

Penjelasan dari atribut dan method pada class Dosen tersebut adalah sebagai berikut:

a. Atribut
- `idDosen (String)`: id unik untuk setiap dosen.
- `nama (String)`: nama lengkap dari dosen.
- `statusAktif (boolean)`: menunjukkan apakah dosen tersebut aktif (true) atau tidak aktif (false) dalam menjalankan tugasnya.
- `tahunBergabung (int)`: tahun ketika dosen mulai bergabung dengan perguruan tinggi.
- `bidangKeahlian (String)`: bidang keahlian dosen yang menjelaskan spesialisasi atau fokus akademik dosen.

b. Method
- `tampilInformasi()`: method ini digunakan untuk menampilkan semua informasi lengkap tentang dosen.
- `setStatusAktif(boolean status)`: method ini digunakan untuk mengatur status aktif dosen. Jika parameter status bernilai true, dosen menjadi aktif. Jika bernilai false, dosen dinyatakan tidak aktif.
- `hitungMasaKerja(int thnSkrg)`: method ini menghitung dan mengembalikan masa kerja dosen dalam tahun berdasarkan tahun bergabung dan tahun saat ini (thnSkrg) yang diberikan sebagai parameter.
- `ubahKeahlian(String bidang)`: method ini digunakan untuk mengubah bidang keahlian dosen.

---  

# Daftar_Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)

---

## Percobaan 1

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6. Commit dan push kode program ke Github
  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

---

## Percobaan 2

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

---

## Percobaan 3  

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6. Commit dan push kode program ke Github
  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban

  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)
