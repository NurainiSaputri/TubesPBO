package penjualan;

public class Pencarian {
    private String namaLaptop;
    
    public Pencarian(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }

    @Override
    public String toString() {
        return this.namaLaptop;
    }

    public String getNamaLaptop() {
        return namaLaptop;
    }

    public void getNamaLaptop(String namaLaptop) {
        this.namaLaptop = namaLaptop;
    }
}
