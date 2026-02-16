# LK01-Latihan tentang class, obyek dan inheritance
# NAMA : STEVEN FIRLI MAJU HASIHOLAN SITORUS 
# NIM : 255150200111021
Latihan 1 pemrograman lanjut 

Pada program yang terlampir, terdapat 4 kelas : bidangDuaDimensi, bujurSangkar, lingkaran, inheriance1. Kelas bidangDuaDimensi berperan sebagai super class (kelas yang sifatnya yang akan diturunkan ke sub class bujurSangkar dan lingkaran ditandai dengan “extends”). Didalam kelas bidangDuaDimensi terdapat contructor yang menginisialisasi nilai awal dari attribute suatu class saat object dibuat serta memastikan object berada pada kondisi siap digunakan. 
Detail contructor : 
-	Pada class bidangDuaDimensi : mengisi nilai variabel nama saat objek dibuat. Nilai paramater (nama) dimasukkan ke atribut milik objek. 
-	Pada class bujurSangkar : memanggil contructor dari super class dan mengisi variabel nama di superclass dengan bujur sangkar. Nilai parameter (sisi) dimasukkan ke atribut milik objek.
-	Pada class lingkaran : memanggil contructor dari super class dan mengisi variabel nama di superclass dengan lingkaran.Nilai paramater (x)  dimasukkan ke atribut milik objek. 
Kemudian terdapat juga overriding method pada class bujurSangkar dan lingkaran hal ini dikarenakan pada setiap bangunDuaDimensi yang berbeda terdapat perbedaan pula dalam perhitungan luasnya. Pada class implementasi (inheritance1) dibuat objek dari subclass bujurSangkar dengan sisi = 10 dan dibuat objek dari subclass lingkaran dengan jari-jari(x) = 7. Untuk outputnya ditampilkan nama serta luas dari bidangnya. 
