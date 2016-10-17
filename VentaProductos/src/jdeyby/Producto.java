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
	private String precio_unitario_compra;
	
	@Persistent
	private String precio_unitario_venta;
	
	@Persistent
	private String stock;

	public Producto(String codigo, String nombre,
			String precio_unitario_compra, String precio_unitario_venta,
			String stock) {
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

	public String getPrecio_unitario_compra() {
		return precio_unitario_compra;
	}

	public void setPrecio_unitario_compra(String precio_unitario_compra) {
		this.precio_unitario_compra = precio_unitario_compra;
	}

	public String getPrecio_unitario_venta() {
		return precio_unitario_venta;
	}

	public void setPrecio_unitario_venta(String precio_unitario_venta) {
		this.precio_unitario_venta = precio_unitario_venta;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
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
