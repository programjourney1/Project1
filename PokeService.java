package Service;

import DAO.PokeRepo;
import org.example.Bug;
import org.example.Flying;
import org.example.Normal;
import org.example.Poison;

import java.sql.SQLException;
import java.util.List;

public class PokeService {
    PokeRepo r;
    LocService ee;
    public PokeService()  {
        r = new PokeRepo();
        try {
            ee= new LocService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List <Poison> getPoison(){return r.getPoison();}
    public List<Flying> getFly(){return r.getFly();}
    public List<Normal> getNorm(){return r.getNorm();}
    public List<Bug> getBug(){return r.getBug();}


    //////////////////////add
    public void addNormal(String Species, String Description){
     //   String existingLizard = r.getNorm(Species, Description);

        Normal newLizard = new Normal(Species, Description);
        r.addNormal(newLizard);}
    //////////////
    public void addFlying(String Species, String Description){
      //  String existingCrocs = r.getCrocs(Species, Description);

        Flying newCroc = new Flying(Species, Description);
        r.addFlying(newCroc);}
    /////////
    public void addBug(String Species, String Description){
      //  String existingSnake = r.getCrocs(Species, Description);

        Bug newSnake = new Bug(Species, Description);
        r.addBug(newSnake);}
    //////////
    public void addPoison(String Species, String Description){
       // String existingTurtle = r.getTurtles(Species, Description);

        Poison newTurtle = new Poison(Species, Description);
        r.addPoison(newTurtle);}
    /*

    public List <Enviro> getEnviro(String Enviro) {
        String En = r.getEnviro(Enviro).toString();
        return r.getEnviro(En);
    }

    public void addEnviro(String species, String enviro) {
        Enviro newEnviro= new Enviro(species, enviro);
        r.addEnviro(newEnviro);
    }
 */


    public Object getAll(String Species) {
        return String.valueOf(r.getAll());
    }


    public Object getAll() {
        return String.valueOf( r.getAll());
    }
}
