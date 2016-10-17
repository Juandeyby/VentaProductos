package jdeyby;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Producto {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	
	private String codigo;
	
	@Persistent
	private String nombre;
	
	@Persistent
	private Double precio_unitario_compra;
	
	@Persistent
	private Double precio_unitario_venta;
	
	@Persistent
	private int stock;

	public Producto(String codigo, String nombre,
			Double precio_unitario_compra, Double precio_unitario_venta,
			int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio_unitario_compra = precio_unitario_compra;
		this.precio_unitario_venta = precio_unitario_venta;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio_unitario_compra() {
		return precio_unitario_compra;
	}

	public void setPrecio_unitario_compra(Double precio_unitario_compra) {
		this.precio_unitario_compra = precio_unitario_compra;
	}

	public Double getPrecio_unitario_venta() {
		return precio_unitario_venta;
	}

	public void setPrecio_unitario_venta(Double precio_unitario_venta) {
		this.precio_unitario_venta = precio_unitario_venta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre
				+ ", precio_unitario_compra=" + precio_unitario_compra
				+ ", precio_unitario_venta=" + precio_unitario_venta
				+ ", stock=" + stock + "]";
	}
}
