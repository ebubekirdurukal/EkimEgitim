package com.egitim.oop;

public class Developer extends Employee implements Coder, Reader{

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

    @Override
    public void kodla() {
        System.out.println("Developer kodluyor");
    }

    @Override
    public void research() {
        System.out.println("ChatpGPT ile araştırma yapıyorum");
    }

    @Override
    public void read() {

    }
}
