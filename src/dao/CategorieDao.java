/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Categorie;

/**
 *
 * @author Tfk
 */
public class CategorieDao {
    private Connection connection;
    private Statement statement;
    
    public CategorieDao(){}
    
    public Categorie getCategorieById(int id)
    {
        String query = "select * from catprivee where id = " + id;
        ResultSet rs;
        Categorie cat = null;
        try {
            connection = Connect.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            if (rs.next())
            {
                cat = new Categorie(rs.getInt("id"), rs.getString("nom"));
            }
            return cat;
        }
        catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return null;
    }
}
