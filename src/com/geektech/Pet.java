package com.geektech;

import java.util.Random;

public class Pet {
    private int are = generateDefaultAre();
    private Color color;
    private Shelter shelter;

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int generateDefaultAre() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
    public String getInfo(){
        return " Are: " + are + "\nColor: " + color  + "\nShelter Name: " +
                shelter.getName() + "\nShelter Address: " + shelter.getAddress();
    }
}
