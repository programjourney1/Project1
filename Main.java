package Util;
import java.sql.Connection;

import Service.EnviroService;
import Service.ReptileService;
import io.javalin.Javalin;
import org.example.Enviro;
import org.example.Reptiles;
import Util.connUtil;
echo "# Project1"
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(9000);
        app.get("/", ctx -> ctx.result("Hello World"));
        Connection conn= connUtil.getConnection();
        EnviroService rs= null;
        try {
            rs = new EnviroService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("  __  ____     ___   __    ___");
        System.out.println(" |  | |  | | / |    |  \\  |    \\  /");
        System.out.println(" |_/  |  | |/  |__  |  |  |___  \\/");
        System.out.println(" |    |  | |\\  |    |  |  |     /\\");
        System.out.println(" |    |__| | \\ |___ |__/  |___ /  \\");
        System.out.println("---------------------------------------------------");
        ///////////////
        System.out.println("Welcome to Your POKEDEX");
        ReptileService rts = new ReptileService();
        ////////////////////////main menu
System.out.println("Choose Action: 1= Read Entries, 2= Write Entry, 3= Poke-Search For Location, 4= Add Location, 5= ALL POKEMON DATA, 6= ReadMe");
///////////////////////////////////////////////////////////////read
int c;
              c = sc.nextInt();
        if (c == 1){
           Scanner sk = new Scanner(System.in);
            System.out.println("You have selected to read entries");
            System.out.println("Select Type of Pokemon: 1= Normal, 2= Poison, 3= Flying, 4= Bug");
           int k;
            k = sk.nextInt();
            if(k== 1)
            { System.out.println("You have selected: Normal Pokemon");
                System.out.println(rts.getLizards());
            }
            else if (k== 2)
            { System.out.println("You have selected: Poison Pokemon");
                System.out.println(rts.getTurtles());}
            else if (k==3)
            { System.out.println("You have selected: Flying Pokemon");
                System.out.println(rts.getCrocs());}
            else if (k==4)
            { System.out.println("You have selected: Bug Pokemon");
                System.out.println(rts.getSnakes());}
            else{System.out.println("Not a valid input");}
                }
        //////////////////////////////////////////////////////////write
         else if (c == 2) {
            System.out.println("You have selected to write an entry.");
            Scanner sk = new Scanner(System.in);
            Scanner skd = new Scanner(System.in);
            System.out.println("Select Type of Pokemon to add: 1= Normal, 2= Poison, 3= Flying, 4= Bug");
            int k;
            k = sk.nextInt();
            if(k== 1)
            {
                System.out.println("You have selected: Normal Pokemon \n"+"Please Input Species, and press enter:");
               String Species = sk.next();
                System.out.println("Input Description");
               String Description = skd.nextLine();
                rts.addLizard(Species, Description);
            }
            else if (k== 2)
            { System.out.println("You have selected: Poison \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addTurtle(Species, Description);
            }
            else if (k==3)
            { System.out.println("You have selected: Flying \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addCroc(Species, Description);
            }
            else if (k==4)
            { System.out.println("You have selected: Bug \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addSnake(Species, Description);
            }
            else{System.out.println("Not a valid input");}
        }
         ///////////////////////////////////Search Enviro Read
        else if (c == 3) {
            System.out.println("====================================== \n" +
                    "____  __       ___            \n" +
                    "|  | |  | | / |      \n" +
                    "|__| |  | |/  |__    \n" +
                    "|    |  | |\\  | \n" +
                    "|    |__| | \\ |__   \n" +
                    "====================================== \n" +
                    " ____   ___  ___  __   _____           \n" +
                    " |     |    |  | |  |  |     |  |      \n" +
                    " |___  |_   |__| |__|  |     |__|      \n" +
                    "     | |    |  | |  \\  |     |  |      \n" +
                    " ____| |___ |  | |   \\ |____ |  |      \n" +
                    "=======================================");
            System.out.println("Search for Pokemon locations. Type Pokemon name (One Word):");
            Scanner skd = new Scanner(System.in);
            String spec;
            spec = skd.next();
            System.out.println(rs.getEnviro(spec));
        }
        //////////////////////////////Enviro Write
        else if (c == 4) {
            System.out.println("You have selected to add a Pokemon and Location to the Location database. \n Type Pokemon Name:");
            Scanner skd = new Scanner(System.in);
            Scanner sk = new Scanner(System.in);
            String Species = skd.next();
            System.out.println("Type Pokemon Environment");
            String Enviro = skd.next();
            rts.addEnviro(Species, Enviro);
        }

         ///////////////////////////////Show All
        else if (c==5){
            System.out.println("Showing ALL Pokemon already found:");
            System.out.println(rs.getAll());
        }

        //////////////////////////////ReadMe
        else if (c == 6){
                System.out.println("Welcome to the world of Pokemon " + '\n'+
                        "This Pokedex is divided into a number of sections."+'\n' +"You may input an entry or read previous entries");
            System.out.println("Poke-Search allows for a pokemon's location to be found or entered. \n" +
                    "A full list off all Pokemon you have seen so far is also available ");
                }
            else{System.out.println("Not a valid input");}
///////////////////////////////////
        }
    }


