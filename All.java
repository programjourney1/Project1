package org.example;

import java.util.List;

public class All {
    public String Species;
    public String Description;
    public String Enviro;
    public All(String Species, String Description ,String Loc) {
        this.Species = Species;
        this.Description = Description;
        this.Enviro = Enviro;}
    @Override
    public String toString() {
        return Species + " - "+ Description+" - Found in: " +Enviro;
    }
}
