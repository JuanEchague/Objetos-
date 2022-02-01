/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Libro {

    ////////////////Atributes////////////////////////
    private int isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;
    ////////////////Builders//////////////////////

    public Libro(int isbn, String titulo, String autor, int nPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nPaginas;
    }

    ////////////////////////////
    public Libro() {
    }
    //////////////////////Setters y Getters////////////

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnroPaginas() {
        return nroPaginas;
    }

    public void setnroPaginas(int nPaginas) {
        this.nroPaginas = nPaginas;
    }

    ///////////////Metodos////////////////////////////
    public void cargarLibro() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el codigo ISBN: ");
        this.isbn = read.nextInt();
        System.out.println("Ingrese el titulo del libro: ");
        this.titulo = read.next();
        System.out.println("Ingrese el nombre del autor: ");
        this.autor = read.next();
        System.out.println("Ingrese el numero de paginas: ");
        this.nroPaginas = read.nextInt();
    }

    public void mostrarLibro() {
        System.out.printf("El codigo ISBN es: %d\n", isbn);
        System.out.printf("El titulo del libro es: %s\n", titulo);
        System.out.printf("El autor del libro es: %s\n", autor);
        System.out.printf("El numero de paginas del libro es: %d\n", nroPaginas);
    }

}
