/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import model.Categorie;

/**
 *
 * @author Tfk
 */
public class CategorieDao {

    private Connection connection;
    private Statement statement;

    public CategorieDao() {
    }

    public Categorie getCategorieById(int id) {
        String query = "select * from categorie where id = " + id;
        ResultSet rs;
        Categorie cat = null;
        try {
            connection = Connect.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            if (rs.next()) {
                cat = new Categorie(rs.getInt("id"), rs.getString("nom"), rs.getBoolean("private"), rs.getString("code"));
            }
            return cat;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    public List<Vector> getAll() {
        String query = "select * from categorie";
        ResultSet rs;
        ResultSetMetaData metaData;
        List<Vector> catList = new ArrayList<>();
        try {
            connection = Connect.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            metaData = rs.getMetaData();
            
            // Names of columns
            Vector<String> columnNames = new Vector<>();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }
            
            // Data
            Vector<Vector<Object>> data = new Vector<>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<>();
                for(int tmp = 1; tmp <= columnCount; tmp++)
                {
                    vector.add(rs.getObject(tmp));
                }
                data.add(vector);
            }
            catList.add(columnNames);
            catList.add(data);
            return catList;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }
    
    public void update(Categorie cat)
    {
        try {
            connection = Connect.getConnection();
            statement = connection.createStatement();
            String query = "UPDATE categorie set nom = '" + cat.getName() + "', prive = " + cat.getPrivat() + ", code = '" + cat.getCode() + "' where id = " + cat.getId();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insert(Categorie cat)
    {
        try{
            connection = Connect.getConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO categorie(nom, prive, code) VALUES ('" + cat.getName() + "', '" + ((cat.getPrivat()) ? 1 : 0) + "', '" + cat.getCode() + "')";
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
