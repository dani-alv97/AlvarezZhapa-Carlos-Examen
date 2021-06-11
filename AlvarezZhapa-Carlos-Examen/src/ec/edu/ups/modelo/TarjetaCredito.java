package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TarjetaCredito implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int codigoVerificacion;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjetaCredito")
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	public TarjetaCredito() {
		
	}
	public TarjetaCredito(int codigo, String numeroTarjeta, String nombreTitular, Date fechaCaducidad,
			int codigoVerificacion, List<Pedido> pedidos) {
		super();
		this.codigo = codigo;
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.codigoVerificacion = codigoVerificacion;
		this.pedidos = pedidos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getCodigoVerificacion() {
		return codigoVerificacion;
	}
	public void setCodigoVerificacion(int codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
