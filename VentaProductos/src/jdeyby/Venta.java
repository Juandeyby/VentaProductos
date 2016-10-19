package jdeyby;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Venta {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String usuario;
	@Persistent
	private String producto;
	@Persistent
	private String codigo_producto;
	@Persistent
	private Date fecha;
	@Persistent
	private int cantidad;
	
	public Venta(String usuario, String producto, String codigo_producto, int cantidad) {
		super();
		this.usuario = usuario;
		this.producto = producto;
		this.codigo_producto = codigo_producto;
		this.fecha = new Date();
		this.cantidad = cantidad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", usuario=" + usuario + ", producto="
				+ producto + ", codigo_producto=" + codigo_producto
				+ ", fecha=" + fecha + ", cantidad=" + cantidad + "]";
	}
	
	
}
