package org.example.presentation;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.BufferedReader;
import java.io.FileReader;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src/main/resources/config.txt")
        );

        // DAO
        String daoClassName = br.readLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        // METIER
        String metierClassName = br.readLine();
        Class<?> cMetier = Class.forName(metierClassName);

        IMetier metier = (IMetier) cMetier
                .getConstructor(IDao.class)
                .newInstance(dao);

        System.out.println("Résultat = " + metier.calcul());
    }
}