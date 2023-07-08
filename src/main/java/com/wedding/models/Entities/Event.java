package com.wedding.models.Entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "namaEvent", length = 125)
    private String namaEvent;

    @Column(name = "tanggalPelaksanaan")
    private Date tanggalPelaksanaan;

    @Column(name = "userID")
    private Integer userID;

    @Column(name = "urlMap")
    private String urlMap;

    public Event() {
    }

    public Event(Integer iD, String namaEvent, Date tanggalPelaksanaan, Integer userID, String urlMap) {
        ID = iD;
        this.namaEvent = namaEvent;
        this.tanggalPelaksanaan = tanggalPelaksanaan;
        this.userID = userID;
        this.urlMap = urlMap;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public Date getTanggalPelaksanaan() {
        return tanggalPelaksanaan;
    }

    public void setTanggalPelaksanaan(Date tanggalPelaksanaan) {
        this.tanggalPelaksanaan = tanggalPelaksanaan;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUrlMap() {
        return urlMap;
    }

    public void setUrlMap(String urlMap) {
        this.urlMap = urlMap;
    }

    public Event orElse(Object object) {
        return null;
    }

}