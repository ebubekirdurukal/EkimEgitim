package com.egitim.oop;

public class Developer extends Employee{

    private String specialization;

    private String favouriteLanguage;

    int calculateSalary(){
        return 70;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }
}
