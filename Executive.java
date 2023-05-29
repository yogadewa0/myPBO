
/*
 * Copyright (c) 2023.
 * Dewa Gede Yoga Semara
 * 225314107
 */

package ProjectUAS;

public class Executive extends Perjanjian {
    public Executive() {
        setMakanan("Packet KFC");
    }

    @Override
    public void setTotal(int biaya) {
        super.setPotongan((int) (biaya * 0.1));
        super.setTotal(biaya - getPotongan());
    }
}
