package Util;
import java.sql.Connection;
import Service.*;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PokeService rts = new PokeService();
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);
        app.start(9004);
        Connection conn = ConnUtil.getConnection();
        LocService rs;
        PokeService rr = new PokeService();
        ///////////////
        String cn;
        cn = ("Welcome to the world of Pokemon " + '\n' +
                "This Pokedex is divided into a number of sections." + '\n' + "You may input an entry or read previous entries \n " +
                "Poke-Search allows for a pokemon's location to be found or entered. \n" +
                "A full list off all Pokemon you have seen so far is also available ");
        app.get("/Pokemon/", ctx -> ctx.result(cn));
        /////////////////////Get by type
        app.get("/Pokemon/Poison/", ctx -> {
            ctx.json(rr.getPoison());
        });
        app.get("/Pokemon/Flying/", ctx -> {
            ctx.json(rr.getFly());
        });
        app.get("/Pokemon/Normal/", ctx -> {
            ctx.json(rr.getNorm());
        });
        app.get("/Pokemon/Bug/", ctx -> {
            ctx.json(rr.getBug());
        });
        //////////////////////////addctx
        app.get("/Pokemon/Bug/", ctx -> {
            ctx.json(rr.addBug());
        });
   ////////////////////////Add
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
            rts.addNormal(Species, Description);
        }
        else if (k== 2)
        { System.out.println("You have selected: Poison \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addPoison(Species, Description);
        }
        else if (k==3)
        { System.out.println("You have selected: Flying \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addFlying(Species, Description);
        }
        else if (k==4)
        { System.out.println("You have selected: Bug \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addBug(Species, Description);
        }
        else{System.out.println("Not a valid input");}
    }


    }
}