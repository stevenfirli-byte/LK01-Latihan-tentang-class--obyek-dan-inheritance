// NAMA : STEVEN FIRLI MAJU HASIHOLAN SITORUS 
// NIM : 255150200111021
//super class 
class bidangDuaDimensi {
    protected String nama;

    // contructor
    public bidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    // method info()
    public void info() {
        System.out.println(nama);
    }

    // method luas() yang belum didefinisikan
    public double luas() {
        return 0;
    }
}

// sub class bujurSangkar
class bujurSangkar extends bidangDuaDimensi {
    protected double sisi;

    // contructor dari class bidangDuaDimensi
    public bujurSangkar(double sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    // overrding method luas()
    public double luas() {
        return sisi * sisi;
    }
}

// sub class lingkaran
class lingkaran extends bidangDuaDimensi {
    protected double x;

    // contructor dari class bidangDuaDimensi
    public lingkaran(double x) {
        super("Lingkaran");
        this.x = x;
    }

    // overrding method luas()
    public double luas() {
        return Math.PI * x * x;
    }
}

// class implementasi (app)
public class inheritance1 {
    public static void main(String[] args) {
        // membuat objek dari class bujurSangkar
        bujurSangkar bs = new bujurSangkar(10);
        bs.info();
        System.out.println("Luas: " + bs.luas());

        // membuat objek dari class lingkaran
        lingkaran lg = new lingkaran(7);
        lg.info();
        System.out.println("Luas: " + lg.luas());
    }
}