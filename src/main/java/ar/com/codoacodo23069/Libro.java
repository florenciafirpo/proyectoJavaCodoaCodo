package ar.com.codoacodo23069;

// libro "es un" Producto
public class Libro extends Producto {

    //tiene sus propios atributos
    private String isbn;

    //constructor
    public Libro(String titulo, String autor, double precio, String imagen, int id,String isbn) {
        //super = padre
       // super(titulo, autor, precio, imagen, id,"");//invocar el constructor del padre => nace el padre
       super(titulo, autor, precio, imagen, isbn);
        //ahora puede nacer el hijo
        this.isbn = isbn;
    }
    
    //el libro no puede nacer, si no nace primero el padre
    
    //metodos
    public String getIsbn() {
        return this.isbn;
    }

    //si una clase no tiene setter, para sus atributos es una "clase inmutable"
}