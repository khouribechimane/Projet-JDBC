package beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import dv1.*;
public class Main {
    public static void main(String[] args) {
         try (MySQLConnection mysqlconnexion = new MySQLConnection("jdbc:mysql://localhost:3306/dv1", "root", "")) {
	        
        ExoJDBC ex = new ExoJDBC(mysqlconnexion);
        //ExoJDBC1 exojdbc = new ExoJDBC1("alami", "Lundi", 5);
        
        ex.afficherMAXnbscripts();
        ex.afficherSUBnbscripts();
        ex.afficherTotalScriptsParSemaine();
        ex.afficherTotalScriptsParDev("ALAMI");
        ex.requeteLibre();
        } catch (Exception e) {
	            e.printStackTrace();
	        }
    }
}