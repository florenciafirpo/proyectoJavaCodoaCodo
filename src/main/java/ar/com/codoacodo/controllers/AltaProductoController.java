package ar.com.codoacodo.controllers;

import java.io.IOException;

import ar.com.codoacodo.dao.DAO;
import ar.com.codoacodo.dao.impl.MysqlDaoImpl;
import ar.com.codoacodo23069.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AltaProductoController")
public class AltaProductoController extends HttpServlet{
 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //asumimos que aca llegan lo parametros desde el formulario
        String titulo = req.getParameter("nombre");
        double precio = Double.parseDouble(req.getParameter("precio"));
        String imagen = "http://bla.com.ar/algo.jpg";
        String codigo = req.getParameter("codigo");
        String autor = req.getParameter("autor");

        //ahora nace el producto EN JVM, pero no existe en la DB!
        //NO INSERT INTO....
        Producto nuevoProducto = new Producto(titulo, autor, precio, imagen,codigo);

        //ahora debo insertar en la base de datos
        //llamar a la implementacion del dao y pasarle el objeto nuevoProducto
        //Interface i = new ClaseQueImplementa();
        DAO dao = new MysqlDaoImpl();
        
        try {
            dao.create(nuevoProducto);//manejo de errores en java: try/catch/finally >  Spring
            getServletContext().getRequestDispatcher("/ListadoProductosController").forward(req, resp);
        } catch (Exception e) {
            getServletContext().getRequestDispatcher( "/nuevo.jsp").forward(req, resp);
            e.printStackTrace();
        }
    }
}