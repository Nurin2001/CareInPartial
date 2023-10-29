package com.assignment.careinlogin;

public class StoreDetail {
    private String storeName, distance, rate;
    private int pharmacyImg;

    public StoreDetail(String pharmacyName, String distance, String rate, int pharmacyImg) {
        this.storeName = pharmacyName;
        this.distance = distance;
        this.rate = rate;
        this.pharmacyImg = pharmacyImg;
    }

    public String getStoreName() {
        return storeName;
    }

    public void getStoreName(String pharmacyName) {
        this.storeName = pharmacyName;
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

    public int getStoreImg() {
        return pharmacyImg;
    }

    public void getStoreImg(int pharmacyImg) {
        this.pharmacyImg = pharmacyImg;
    }
}
