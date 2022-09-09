package org.example;

public class Normal {
    public String Species;
    public String Description;


    public Normal(String Species, String Description) {
        this.Species = Species;
        this.Description = Description;
    }
    /////////////
    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public void setSpecies(String Species){this.Species=Species;}

    public String getNormalS() {

        return Species;
    }
    public String getNormalD() {

        return Description;
    }
}
