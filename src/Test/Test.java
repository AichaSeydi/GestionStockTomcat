package Test;

import sn.senStock.DAO.IProduit;
import sn.senStock.DAO.ProduitImpl;
import sn.senStock.entities.Produit;

public class Test {
    public static void main(String[] args){
        IProduit iProduit = new ProduitImpl();
        Produit p = new Produit();
        p.setNom("Ordinateur");
        p.setQtStock(125);

        int ok = iProduit.add(p);
        System.out.print(ok);
    }
}
