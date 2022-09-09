package DAO;
import java.sql.Connection;
import Util.ConnUtil;
import org.example.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PokeRepo {
    Connection conn;
        public PokeRepo(){ conn = ConnUtil.getConnection();}
       /* public List<Lizards> getLizards(){
            List<Lizards> allLizards = new ArrayList<>();
            try{
                Statement statement =conn.createStatement();
                ResultSet rs = statement.executeQuery("Select * FROM Lizards");
                while (rs.next()){
                    Lizards loadingLizards= new Lizards(rs.getString("Species"),rs.getString("Description"));
                    allLizards.add(loadingLizards);}
            }catch (SQLException e){
                e.printStackTrace();
            }
            return allLizards;
        }

        */
        ///////
        public List<Loc> getLoc(String Loc){
            List<Loc> allEnviro = new ArrayList<>();
            try{
                //Statement statement =conn.createStatement();
                PreparedStatement statement = conn.prepareStatement("Select * FROM Loc where Species = ?");
                statement.setString(1,Loc);
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Loc loadingEnviro= new Loc(rs.getString("Enviroment"), rs.getString("Species"));
                    allEnviro.add(loadingEnviro);}
            }catch (SQLException e){
                e.printStackTrace();
            }
            return allEnviro;
        }
        /////////////

        public List<Poison> getPoison(){
            List<Poison> allSnakes = new ArrayList<>();

            try{
                Statement statement =conn.createStatement();
                ResultSet rs = statement.executeQuery("Select * FROM Turtles");
                while (rs.next()){
                    Poison loadingPoison= new Poison(rs.getString("Species"),rs.getString("Description"));
                    allSnakes.add(loadingPoison);
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return allSnakes;
        }
    public List<Flying> getFly(){
        List<Flying> allSnakes = new ArrayList<>();

        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Crocs");
            while (rs.next()){
                Flying loadingPoison= new Flying(rs.getString("Species"),rs.getString("Description"));
                allSnakes.add(loadingPoison);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allSnakes;
    }
    public List<Normal> getNorm(){
        List<Normal> allSnakes = new ArrayList<>();

        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Lizards");
            while (rs.next()){
                Normal loadingPoison= new Normal(rs.getString("Species"),rs.getString("Description"));
                allSnakes.add(loadingPoison);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allSnakes;
    }
    public List<Bug> getBug(){
        List<Bug> allSnakes = new ArrayList<>();

        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Snakes");
            while (rs.next()){
                Bug loadingPoison= new Bug(rs.getString("Species"),rs.getString("Description"));
                allSnakes.add(loadingPoison);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allSnakes;
    }
        //////
        public void addNormal(Normal r){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Lizards( Species, Description ) " +
                        "values (?,?)");
                statement.setString(1, r.getNormalS());
                statement.setString(2, r.getNormalD());
                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        //////////////////////

        public void addFlying(Flying r){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Crocs( Species, Description) " +
                        "values (?,?)");
                statement.setString(1, r.getFlyingS());
                statement.setString(2, r.getFlyingD());
                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        ////////////
        public void addBug(Bug r){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Snakes( Species, Description)  " +
                        "values (?,?)");
                statement.setString(1, r.getBugS());
                statement.setString(2, r.getBugD());

                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        /////////////
        public void addPoison(Poison r){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Turtles( Species, Description) " +
                        "values (?,?)");
                statement.setString(1, r.getPoisonS());
                statement.setString(2, r.getPoisonD());
                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }



        //////////////////////////////////////Write Enviro
        public void addLoc(Loc k){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Loc( Species, Enviroment) " +
                        "values (?,?)");
                statement.setString(1, k.getEnviroS());
                statement.setString(2, k.getEnviroE());
                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        /////////////////////////ALL
        public List<All> getAll(){
            List<All> allAll = new ArrayList<>();
            try{
                PreparedStatement statement = conn.prepareStatement("SELECT Pokemon.Description, Enviro.Species,Enviroment\n" +
                        "FROM Pokemon\n" +
                        "Join Enviro\n" +
                        "ON Pokemon.Species =Enviro.Species");
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    All loadingAll= new All (rs.getString("Species"), rs.getString("Description"), rs.getString("Enviroment"));
                    allAll.add(loadingAll);}
            }catch (SQLException e){
                e.printStackTrace();
            }
            return allAll;
        }


  //  }



}
