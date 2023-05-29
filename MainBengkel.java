
/*
 * Copyright (c) 2023.
 * Dewa Gede Yoga Semara
 * 225314107
 */

package ProjectUAS;

import java.util.Scanner;

public class MainBengkel {
    public static void main(String[] args) {
        Scanner scSt = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        String namaKantor;
        String almtKntr;
        String nmCust;
        String noKendaraanCust;
        String biaya;
        int member = -1;
        int nCust;

        System.out.println("Masukkan Banyak Perjanjian");
        nCust = sc.nextInt();

        Perjanjian[] custList = new Perjanjian[nCust];
        for (int i = 0; i < nCust; i++) {
            System.out.print("Masukkan Nama Perjanjian : ");
            nmCust = scSt.nextLine();
            System.out.print("Masukkan No Kendaraan : ");
            noKendaraanCust = scSt.nextLine();
            custList[i] = new Perjanjian(nmCust, noKendaraanCust);
            while (member < 1 || member > 3){
                System.out.println("Jenis Member : ");
                System.out.println("1. Regular");
                System.out.println("2. Bisnis");
                System.out.println("3. Executive");
                member = sc.nextInt();
                switch (member) {
                    case 1 -> custList[i] = new Perjanjian();
                    case 2 -> custList[i] = new Bisnis();
                    case 3 -> custList[i] = new Executive();
                    default -> System.out.println("Pilihan Member Tidak Tersedia !!");
                }
            }
        }
    }
}
