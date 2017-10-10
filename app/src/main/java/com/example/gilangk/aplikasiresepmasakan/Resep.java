package com.example.gilangk.aplikasiresepmasakan;

/**
 * Created by cipowela on 10/10/17.
 */

public class Resep {
    private String judul , isi;
    private int gambar;

    Resep(String judul, String isi, int gambar) {

        this.judul = judul;
        this.isi = isi;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }

    public int getGambar() {
        return gambar;
    }
}
