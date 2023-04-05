/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busbrt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlh_penumpang = 5;
        int max = 20;
        System.out.println("Nadia Dita Salsabila (21081010181) ");
        System.out.println("-----------------------------------------");
        System.out.println("OUTPUT : ");
        System.out.println("-----------------------------------------");
        System.out.println("Bus Berangkat dari Kantor >> Halte Porong");
        System.out.println("Jumlah Penumpang : " + jmlh_penumpang);
        System.out.println("3 Penumpang Turun di Halte Porong");
        System.out.println("2 Penumpang Turun di Halte Gresik");
        do {
            System.out.println("-----------------------------------------");
            halte porong = new halte(jmlh_penumpang, max);
            System.out.println(porong.getTunggu() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Porong");
            System.out.print("Jumlah Penumpang yang Ingin Turun : ");

            int temp = input.nextInt();
            temp = porong.get_penumpang() - temp;

            System.out.println(temp + " Penumpang Turun");
            System.out.println(porong.getTunggu() + " Penumpang Naik");

            temp = temp + porong.getTunggu();

            System.out.println("Jumlah Penumpang " + temp);

            int penumpang = porong.getTunggu() - porong.getTunggu();
            System.out.println("Halte Porong " + penumpang + " Penumpang Menunggu");
            System.out.println("-----------------------------------------");

            halte surabaya = new halte(temp, max);
            System.out.println(surabaya.getTunggu() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Surabaya");
            System.out.print("Jumlah Penumpang yang Ingin Turun : ");

            int jumlah = input.nextInt();
            System.out.println(jumlah + " Penumpang Turun");
            jumlah = surabaya.get_penumpang() - jumlah;

            System.out.println(surabaya.getTunggu() + " Penumpang Naik");

            jumlah = jumlah + surabaya.getTunggu();

            System.out.println("Jumlah Penumpang " + jumlah);

            int penumpang2 = surabaya.getTunggu() - surabaya.getTunggu();

            System.out.println("Halte Surabaya " + penumpang2 + " Penumpang Menunggu");
            System.out.println(jumlah + " Bus Menuju ke Halte Gresik");
            System.out.println("-----------------------------------------");

            halte gresik = new halte(jumlah, max);
            System.out.println(gresik.getTunggu() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Gresik");
            System.out.print("Jumlah Penumpang yang Ingin Turun : ");
            
            int penumpang_gresik = input.nextInt();
            System.out.println(penumpang_gresik + " Penumpang Turun");
            penumpang_gresik = gresik.get_penumpang() - penumpang_gresik;

            System.out.println(gresik.getTunggu() + " Penumpang Naik");

            penumpang_gresik = penumpang_gresik + gresik.getTunggu();

            System.out.println("Jumlah Penumpang " + penumpang_gresik);

            int penumpang3 = gresik.getTunggu() - gresik.getTunggu();
            System.out.println("Halte Gresik " + penumpang3 + " Penumpang Menunggu");

            jmlh_penumpang = penumpang_gresik;
        } while (jmlh_penumpang <= 20);
        input.close();
    }
}