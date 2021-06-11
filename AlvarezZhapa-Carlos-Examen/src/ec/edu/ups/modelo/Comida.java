package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comida implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private double precioU;
	@ManyToOne
	@JoinColumn
	private Pedido pedidoComida;
	
	
	public Comida() {
		
	}
	public Comida(int codigo, String nombre, double precioU, Pedido pedidoComida) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioU = precioU;
		this.pedidoComida = pedidoComida;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public Pedido getPedidoComida() {
		return pedidoComida;
	}
	public void setPedidoComida(Pedido pedidoComida) {
		this.pedidoComida = pedidoComida;
	}
	
}
