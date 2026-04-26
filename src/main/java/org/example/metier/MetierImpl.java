package org.example.metier;

import org.example.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    // Injection par constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 2;
    }
}
