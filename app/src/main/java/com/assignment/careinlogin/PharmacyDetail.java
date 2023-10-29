package com.assignment.careinlogin;

public class PharmacyDetail {
    private String pharmacyName, distance, rate;
    private int pharmacyImg;

    public PharmacyDetail(String pharmacyName, String distance, String rate, int pharmacyImg) {
        this.pharmacyName = pharmacyName;
        this.distance = distance;
        this.rate = rate;
        this.pharmacyImg = pharmacyImg;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getPharmacyImg() {
        return pharmacyImg;
    }

    public void setPharmacyImg(int pharmacyImg) {
        this.pharmacyImg = pharmacyImg;
    }
}
