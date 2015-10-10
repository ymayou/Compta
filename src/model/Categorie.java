/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package model;

import dao.CategorieDao;

/**
 *
 * @author Tfk
 */
public class Categorie {
    private int id;
    private String name;
    private boolean privat;
    private String code;

    public Categorie(int id, String name, boolean privat, String code) {
        this.id = id;
        this.name = name;
        this.privat = privat;
        this.code = code;
    }
    
    public Categorie(String name, boolean privat, String code) {
        this.name = name;
        this.privat = privat;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean getPrivat() {
        return privat;
    }

    public void setPrivat(boolean privat) {
        this.privat = privat;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void update() {
        CategorieDao cat = new CategorieDao();
        cat.update(this);
    }
    
    public void insert()
    {
        CategorieDao cat = new CategorieDao();
        cat.insert(this);
    }
}
