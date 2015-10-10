/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package model;

import java.sql.Date;

/**
 *
 * @author Tfk
 */
public class Transaction {
    private int id;
    private Date date;
    private String banque;
    private String descriptionPrivee;
    private String desciptionDec;
    private double montant;
    private Categorie catPrivee;
    private Categorie catDec;

    public Transaction(Date date, String banque, String descriptionPrivee, String desciptionDec, double montant, Categorie catPrivee, Categorie catDec) {
        this.date = date;
        this.banque = banque;
        this.descriptionPrivee = descriptionPrivee;
        this.desciptionDec = desciptionDec;
        this.montant = montant;
        this.catPrivee = catPrivee;
        this.catDec = catDec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getDescriptionPrivee() {
        return descriptionPrivee;
    }

    public void setDescriptionPrivee(String descriptionPrivee) {
        this.descriptionPrivee = descriptionPrivee;
    }

    public String getDesciptionDec() {
        return desciptionDec;
    }

    public void setDesciptionDec(String desciptionDec) {
        this.desciptionDec = desciptionDec;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Categorie getCatPrivee() {
        return catPrivee;
    }

    public void setCatPrivee(Categorie catPrivee) {
        this.catPrivee = catPrivee;
    }

    public Categorie getCatDec() {
        return catDec;
    }

    public void setCatDec(Categorie catDec) {
        this.catDec = catDec;
    }
}
