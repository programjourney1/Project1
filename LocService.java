package Service;

import DAO.PokeRepo;
import org.example.Loc;

import java.sql.SQLException;
import java.util.List;

public class LocService {
    PokeRepo rr;


    public LocService() throws SQLException {
        rr=new PokeRepo();
    }
    //public LocService(PokeRepo rr){
    //    this.rr=rr;
   // }
    public List<Loc> getLoc(String E){
        return rr.getLoc(E);

    }
    public void addLoc(String Species, String Loc){


        Loc newEnviro = new Loc(Species, Loc);
        rr.addLoc(newEnviro);}


    public String getAll() {
        return String.valueOf(rr.getAll());
    }
}
