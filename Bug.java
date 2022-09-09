package org.example;

public class Bug {
    public String Species;
    public String Description;


    public Bug(String Species, String Description) {
        this.Species = Species;
        this.Description = Description;
    }
    /////////////
    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public void setSpecies(String Species){this.Species=Species;}
    public String getBugS() {

        return Species;
    }
    public String getBugD() {

        return Description;
    }
}
