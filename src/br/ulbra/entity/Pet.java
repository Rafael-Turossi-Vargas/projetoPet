package br.ulbra.entity;

import java.util.ArrayList;

public class Pet {

    private int idPet;
    public String racaPet;
    public String portePet;
    public String descPet;
    public double pesoPet;
    public String vascPet;

    public Pet(int idPet, String racaPet, String portePet, String descPet, double pesoPet, String vascPet) {

        this.idPet = idPet;
        this.racaPet = racaPet;
        this.portePet = portePet;
        this.descPet = descPet;
        this.pesoPet = pesoPet;
        this.vascPet = vascPet;
    }

    public Pet() {

    }

    
      
    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public void setRacaPet(String racaPet) {
        this.racaPet = racaPet;
    }

    public String getPortePet() {
        return portePet;
    }

    public void setPortePet(String portePet) {
        this.portePet = portePet;
    }

    public String getDescPet() {
        return descPet;
    }

    public void setDescPet(String descPet) {
        this.descPet = descPet;
    }

    public double getPesoPet() {
        return pesoPet;
    }

    public void setPesoPet(double pesoPet) {
        this.pesoPet = pesoPet;
    }

    public String getVascPet() {
        return vascPet;
    }

    public void setVascPet(String vascPet) {
        this.vascPet = vascPet;
    }

    public void add(ArrayList<Pet> Pet) {

    }

}
