package sn.senStock.DAO;

import sn.senStock.entities.Produit;

import java.util.List;

public interface IProduit  {
    public int add(Produit produit);
    public List<Produit> list();

}
