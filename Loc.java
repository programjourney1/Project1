package org.example;

import DAO.PokeRepo;

import java.sql.SQLException;
import java.util.List;

public class Loc {
    public String Species;
    public String Loc;
    public Loc(String Species, String Loc ) {
        this.Species = Species;
        this.Loc = Loc;}
    @Override
    public String toString() {
        return Species + " for:" +Loc;
    }
    public String getEnviroS() {
        return Species;
    }

    public String getEnviroE() {
        return Loc;
    }
}
