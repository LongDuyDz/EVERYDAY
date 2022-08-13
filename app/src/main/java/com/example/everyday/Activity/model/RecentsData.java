package com.example.everyday.Activity.model;

public class RecentsData {

    String some;
    String tue;
    String but;
    Integer imageUrl;
    public String getSome() {
        return some;
    }

    public void setSome(String some) {
        this.some = some;
    }

    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public String getBut() {
        return but;
    }

    public void setBut(String but) {
        this.but = but;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsData(String some, String tue, String but, Integer imageUrl) {
        this.some = some;
        this.tue = tue;
        this.but = but;
        this.imageUrl = imageUrl;
    }
}
