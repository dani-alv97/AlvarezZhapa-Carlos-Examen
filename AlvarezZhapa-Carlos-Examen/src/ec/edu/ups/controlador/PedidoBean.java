package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.ejb.TarjetaCreditoFacade;
import ec.edu.ups.entidades.Categoria;
import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Pedido;
import ec.edu.ups.modelo.TarjetaCredito;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@EJB
	private ComidaFacade ejbComida;
	@EJB
	private TarjetaCreditoFacade ejbTarjeta;
	@EJB
	private PedidoFacade ejbPedido;
	private List<TarjetaCredito> listaTarjeta;
	private List<Pedido> listaPedido;
	private List<Comida> listaComida;
	private Date fecha;
	private String nombreCliente;
	private double subTotal;
	private double iva;
	private double total;
	private String observaciones;
	private String nombre;
	private double precioU;
	
	
	
	public PedidoBean () {
		
	}
	
	@PostConstruct
	public void init() {
		listaTarjeta = ejbTarjeta.findAll();
		listaPedido = ejbPedido.findAll();
		listaComida = ejbComida.findAll();
	}

	public ComidaFacade getEjbComida() {
		return ejbComida;
	}

	public void setEjbComida(ComidaFacade ejbComida) {
		this.ejbComida = ejbComida;
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

	public List<Comida> getListaComida() {
		return listaComida;
	}

	public void setListaComida(List<Comida> listaComida) {
		this.listaComida = listaComida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	public String agregarComida() {
		ejbComida.create(new Comida(0, nombre, precioU, pedidoComida));
	}
	
	public Categoria buscarCategoria(String nombre) {
		int salida=0;		
		for(int i=0;i<this.getCategoriasBodega().size();i++) {			
			if(this.getCategoriasBodega().get(i).getNombre().equals(nombre)) {
				salida=i;
			}
		}		
		return this.getCategoriasBodega().get(salida);
	}
	
	public Categoria buscarTarjeta(String numeroTarjeta) {
		int salida=0;		
		for(int i=0;i<this.getListaTarjeta()().size();i++) {			
			if(this.getListaTarjeta().get(i).getNumeroTarjeta().equals(numeroTarjeta)) {
				salida=i;
			}
		}		
		return this.getListaTarjeta().get(salida);
	}
}
