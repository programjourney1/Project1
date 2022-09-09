package org.example;

public class Poison {
    public String Species;
    public String Description;


    public Poison(String Species, String Description) {
        this.Species = Species;
        this.Description = Description;
    }
    /////////////
    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public void setSpecies(String Species){this.Species=Species;}



    public String getPoisonS() {

        return Species;
    }
    public String getPoisonD() {

        return Description;
    }

}


