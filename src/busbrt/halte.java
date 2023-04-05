/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busbrt;

public class halte {
    private int jumlahpenumpang;
    private int max;
    private int tunggu;

    public halte(int jumlah_penumpang, int max_penumpang, int tunggu_penumpang) {
        this.jumlahpenumpang = jumlah_penumpang;
        this.max = max_penumpang;
        this.tunggu = tunggu_penumpang;
    }

    public halte(int jumlah_penumpang, int max_penumpang) {
        this (jumlah_penumpang, max_penumpang, 2);
    }

    public int get_penumpang () {
        return jumlahpenumpang;
    }

    public void set_penumpang (int penumpang) {
        this.jumlahpenumpang = penumpang;
    }

    public int get_maksimal () {
        return max;
    }

    public void set_maksimal (int max_penumpang) {
        this.max = max_penumpang;
    }

    public int getTunggu () {
        return tunggu;
    }
    
    public void set_wait (int wait) {
        this.tunggu = wait;
    }
}