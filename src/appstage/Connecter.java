/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstage;

import java.sql.*;

/**
 *
 * @author Badr
 */
public class Connecter {
      Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
//pour afficher l erreur
    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Renault","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}

    PreparedStatement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}