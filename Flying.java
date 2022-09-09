package org.example;

public class Flying {
    public String Species;
    public String Description;


    public Flying(String Species, String Description) {
        this.Species = Species;
        this.Description = Description;
    }
    /////////////
    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public void setSpecies(String Species){this.Species=Species;}
    public String getFlyingS() {

        return Species;
    }
    public String getFlyingD() {

        return Description;
    }
}
