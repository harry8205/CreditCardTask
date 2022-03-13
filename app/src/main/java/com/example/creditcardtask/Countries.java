package com.example.creditcardtask;

public class Countries {
    private String countryName;
    private int flagImage;

    public Countries(String countryName, int flagImage) {
        this.countryName = countryName;
        this.flagImage = flagImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getFlagImage() {
        return flagImage;
    }
}
