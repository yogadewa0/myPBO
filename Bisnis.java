
/*
 * Copyright (c) 2023.
 * Dewa Gede Yoga Semara
 * 225314107
 */

package ProjectUAS;

public class Bisnis extends Perjanjian {
    public Bisnis() {
        setMakanan("Nasi Kotak & Air Mineral");
    }

    @Override
    public void setTotal(int biaya) {
        super.setPotongan((int) (biaya * 0.05));
        super.setTotal(biaya - getPotongan());
    }
}
