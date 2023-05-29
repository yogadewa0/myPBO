
/*
 * Copyright (c) 2023.
 * Dewa Gede Yoga Semara
 * 225314107
 */

package ProjectUAS;

public class KantorPelayanan {
    private String namaKantor;
    private String alamat;
    private Perjanjian[] cust;

    public String getNamaKantor() {
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Perjanjian[] getCust() {
        return cust;
    }

    public void setCust(Perjanjian[] cust) {
        this.cust = cust;
    }

    public KantorPelayanan() {
        this.namaKantor = "Kantor Utama";
        this.alamat = "Paingan";
    }

    public KantorPelayanan(String namaKantor, String alamat) {
        this.namaKantor = namaKantor;
        this.alamat = alamat;
    }
}
