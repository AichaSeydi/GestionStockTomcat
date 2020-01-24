package sn.senStock.controller;

import sn.senStock.DAO.IProduit;
import sn.senStock.DAO.ProduitImpl;
import sn.senStock.entities.Produit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Produit", name = "produit")
public class ProduitServlet extends HttpServlet {
    private IProduit produitdao ;

    @Override
    public void init(ServletConfig config) throws ServletException {

        produitdao = new ProduitImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.getWriter().print("ok");
        req.getRequestDispatcher("produit/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom = req.getParameter("nom").toString();
        double qtSock = Double.parseDouble(req.getParameter("qtStock").toString());
        Produit p = new Produit();
        p.setNom(nom);
        p.setQtStock(qtSock);
        produitdao.add(p);
        doGet(req,resp);
     }
}
