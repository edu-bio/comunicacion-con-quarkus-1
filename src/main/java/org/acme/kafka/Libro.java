package org.acme.kafka;

import java.io.Serializable;

public class Libro implements Serializable{

	private static final long serialVersionUID = 4571560853155430079L;
	private String titulo;
	private int isbn;
	private double precio;
	private int id;
	private static int numeroLibros=0;
	
	public Libro(String titulo) {
		int aleatorio = (int)(Math.random()*100000);
		double precio= (Math.random()*5 + 95);
		this.titulo=titulo;
		this.isbn=aleatorio;
		this.id=numeroLibros++;
		this.precio=precio;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", precio=" + precio + ", id=" + id + "]";
	}

	
}
