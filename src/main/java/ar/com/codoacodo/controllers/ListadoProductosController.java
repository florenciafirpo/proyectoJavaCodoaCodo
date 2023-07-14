package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;

import ar.com.codoacodo.dao.DAO;
import ar.com.codoacodo.dao.impl.MysqlDaoImpl;
import ar.com.codoacodo23069.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListadoProductosController")
public class ListadoProductosController extends HttpServlet{
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DAO dao = new MysqlDaoImpl();
        
        try {
            ArrayList<Producto> productos =  dao.findAll();

            //guardo en la request algo!

            req.setAttribute("listado", productos);

            //ahora anda a la vista listado.jsp
            req.getRequestDispatcher("listado.jsp").forward(req, resp);//interna!!!
        } catch (Exception e) {
            e.printStackTrace();

            req.setAttribute("listado", new ArrayList<>());
            req.getRequestDispatcher("listado.jsp").forward(req, resp);//interna!!!
        }
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doGet(req, resp);
    }
}