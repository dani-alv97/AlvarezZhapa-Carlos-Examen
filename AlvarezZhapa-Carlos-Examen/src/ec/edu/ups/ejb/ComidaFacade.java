package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Pedido;

@Stateless
public class ComidaFacade extends AbstractFacade<Comida>{

	@PersistenceContext(unitName = "AlvarezZhapa-Carlos-Examen")
	private EntityManager em;
	
	public ComidaFacade() {
		super(Comida.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
