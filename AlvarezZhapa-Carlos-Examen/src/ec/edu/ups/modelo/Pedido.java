package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	private Date fecha;
	private String nombreCliente;
	private double subTotal;
	private double iva;
	private double total;
	private String observaciones;
	@ManyToOne
	@JoinColumn
	private TarjetaCredito tarjetaCredito;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoComida")
	private List<Comida> listaComida = new ArrayList<Comida>();
	
	
	public Pedido() {
		
	}

	public Pedido(int numero, Date fecha, String nombreCliente, double subTotal, double iva, double total,
			String observaciones, TarjetaCredito tarjetaCredito, List<Comida> listaComida) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.nombreCliente = nombreCliente;
		this.subTotal = subTotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones;
		this.tarjetaCredito = tarjetaCredito;
		this.listaComida = listaComida;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public List<Comida> getListaComida() {
		return listaComida;
	}

	public void setListaComida(List<Comida> listaComida) {
		this.listaComida = listaComida;
	}
	
}
