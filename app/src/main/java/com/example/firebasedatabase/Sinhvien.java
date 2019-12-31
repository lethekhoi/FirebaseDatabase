package com.example.firebasedatabase;

public class Sinhvien {
    private String ten;
    private String tuoi;

    public String getTen() {
        return ten;
    }

    public Sinhvien() {
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public Sinhvien(String ten, String tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
}
