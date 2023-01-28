package com.egitim.oop;

public class Tester extends Employee implements Coder{

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

    @Override
    public void kodla() {
        System.out.println("Qa kod yazıyor");
    }

    @Override
    public void research() {

    }
}
