package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaCreditoFacade;
import ec.edu.ups.modelo.Pedido;
import ec.edu.ups.modelo.TarjetaCredito;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class TarjetaCreditoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@EJB
	private TarjetaCreditoFacade ejbTarjeta;
	@EJB
	private PedidoFacade ejbPedido;
	private List<TarjetaCredito> listaTarjeta;
	private List<Pedido> listaPedido;
	private String numeroTarjeta;
	private String nombreTitular;
	private Date fechaCaducidad;
	private int codigoVerificacion;
	
	
	public TarjetaCreditoBean() {
		
	}
	
	@PostConstruct
	public void init() {
		listaTarjeta = ejbTarjeta.findAll();
		listaPedido = ejbPedido.findAll();
	}

	public TarjetaCreditoFacade getEjbTarjeta() {
		return ejbTarjeta;
	}

	public void setEjbTarjeta(TarjetaCreditoFacade ejbTarjeta) {
		this.ejbTarjeta = ejbTarjeta;
	}

	public PedidoFacade getEjbPedido() {
		return ejbPedido;
	}

	public void setEjbPedido(PedidoFacade ejbPedido) {
		this.ejbPedido = ejbPedido;
	}

	public List<TarjetaCredito> getListaTarjeta() {
		return listaTarjeta;
	}

	public void setListaTarjeta(List<TarjetaCredito> listaTarjeta) {
		this.listaTarjeta = listaTarjeta;
	}

	public List<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(List<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	
}
