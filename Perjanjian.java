
/*
 * Copyright (c) 2023.
 * Dewa Gede Yoga Semara
 * 225314107
 */

package ProjectUAS;

public class Perjanjian {
    private String nama;
    private String noKendaraan;
    private String makanan;
    private int potongan;
    private int total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKendaraan() {
        return noKendaraan;
    }

    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Perjanjian() {
        this.potongan = 0;
    }

    public Perjanjian(String nama, String noKendaraan) {
        this.nama = nama;
        this.noKendaraan = noKendaraan;
    }

    public int total(int biaya){
        this.total = biaya;
        return biaya;
    }
}
