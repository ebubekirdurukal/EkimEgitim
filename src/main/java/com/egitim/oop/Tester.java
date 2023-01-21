package com.egitim.oop;

public class Tester extends Employee{

    private String specialization;

    private String favouriteTestTool;


    int calculateSalary(){
        return 70;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getFavouriteTestTool() {
        return favouriteTestTool;
    }

    public void setFavouriteTestTool(String favouriteTestTool) {
        this.favouriteTestTool = favouriteTestTool;
    }
}
