package org.example.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Récupération des données...");
        return Math.random() * 100;
    }
}