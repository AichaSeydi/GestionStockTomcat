package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.senStock.DAO.IProduit;
import sn.senStock.DAO.ProduitImpl;
import sn.senStock.entities.Produit;

public class JUnitTest {

    @Before
    public void beforeTest(){
        System.out.println("============Before=============");
    }

    @After
    public void afterTest(){
        System.out.println("============After=============");

    }

    @Test
    public void testAddProduit(){
        IProduit iProduit = new ProduitImpl();
        Produit p = new Produit();
        p.setNom("Table");
        p.setQtStock(10);

        iProduit.add(p);
    }
}
