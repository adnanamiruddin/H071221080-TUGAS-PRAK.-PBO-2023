package No1.BangunDatar;

import java.util.Scanner;

public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        // Sisi Persegi ditaro di variabel Panjang
        this.setPanjang(sisi);
    }

    @Override
    double hitungLuas() {
        double luas = this.getPanjang() * this.getPanjang();
        return luas;
    }

    @Override
    double hitungKeliling() {
        double keliling = 4 * this.getPanjang();
        return keliling;
    }

    public static void runPersegi() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PERSEGI ===");
        System.out.println("Masukkan sisi");
        System.out.print("> ");
        int inpSisi = sc.nextInt();
        sc.nextLine();
        Persegi persegi = new Persegi(inpSisi);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = persegi.hitungLuas();
                System.out.println("Luas persegi = " + result);
                break;
            case 2:
                result = persegi.hitungKeliling();
                System.out.println("Keliling persegi = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
