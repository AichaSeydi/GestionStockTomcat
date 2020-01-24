package sn.senStock.DAO;

import sn.senStock.entities.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProduitImpl implements IProduit {
    private EntityManager em;

    public ProduitImpl(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionStockTomcat");
        em = emf.createEntityManager();
    }

    @Override
    public int add(Produit produit) {
        int ok = 0;
        try {
            em.getTransaction().begin();
            em.persist((produit));
            em.getTransaction().commit();
            ok =1;
            return ok;
        }catch (Exception ex){
            ex.printStackTrace();
            return ok;
        }
    }

    @Override
    public List<Produit> list() {
        return em.createQuery("SELECT p FROM Produit p").getResultList();
    }
}
