package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ComidaFacade;
import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Pedido;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class ComidaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	@EJB
	private ComidaFacade ejbComida;
	@EJB
	private PedidoFacade ejbPedido;
	private List<Pedido> listaPedido;
	private List<Comida> listaComida;
	private String nombre;
	private double precioU;
	public ComidaBean() {
		
	}
	@PostConstruct
	public void init() {
		listaPedido = ejbPedido.findAll();
		listaComida = ejbComida.findAll();
	}
	public ComidaFacade getEjbComida() {
		return ejbComida;
	}
	public void setEjbComida(ComidaFacade ejbComida) {
		this.ejbComida = ejbComida;
	}
	public PedidoFacade getEjbPedido() {
		return ejbPedido;
	}
	public void setEjbPedido(PedidoFacade ejbPedido) {
		this.ejbPedido = ejbPedido;
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
	
	public void crearComida() {
		ejbComida.create(new Comida(0, nombre, precioU, null));
	}
	
	public Pedido buscarPedido(int numero) {
		int salida=0;		
		for(int i=0;i<this.getListaPedido().size();i++) {			
			if(this.getListaPedido().get(i).getNumero()) {
				salida=i;
			}
		}		
		return this.getListaPedido().get(salida);
	}
	
}
