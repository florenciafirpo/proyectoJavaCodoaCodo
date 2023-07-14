package ar.com.codoacodo.dao;

import java.util.ArrayList;

import ar.com.codoacodo23069.Producto;

public interface DAO {
    public Producto getById(Long id) throws Exception;//LA PK DE LA TABLA
    public void delete(Long id) throws Exception;//LA PK DE LA TABLA
    public ArrayList<Producto> findAll() throws Exception;
    public void update(Producto articulo) throws Exception;//TIENE ID
    public void create(Producto articulo) throws Exception;//NO TIENE ID
}