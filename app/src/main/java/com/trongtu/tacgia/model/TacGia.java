package com.trongtu.tacgia.model;

import java.io.Serializable;

public class TacGia implements Serializable {
    private String ten_tacgia, id_tacgia;
    private int imgTacGia;
    public TacGia() {

    }

    public TacGia(String ten_tacgia, String id_tacgia, int imgTacGia) {
        this.ten_tacgia = ten_tacgia;
        this.id_tacgia = id_tacgia;
        this.imgTacGia = imgTacGia;
    }

    public String getTen_tacgia() {
        return ten_tacgia;
    }

    public void setTen_tacgia(String ten_tacgia) {
        this.ten_tacgia = ten_tacgia;
    }

    public String getId_tacgia() {
        return id_tacgia;
    }

    public void setId_tacgia(String id_tacgia) {
        this.id_tacgia = id_tacgia;
    }

    public int getImgTacGia() {
        return imgTacGia;
    }

    public void setImgTacGia(int imgTacGia) {
        this.imgTacGia = imgTacGia;
    }
}
