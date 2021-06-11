package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.modelo.TarjetaCredito;

@Stateless
public class TarjetaCreditoFacade extends AbstractFacade<TarjetaCredito>{

	@PersistenceContext(unitName = "AlvarezZhapa-Carlos-Examen")
	private EntityManager em;
	
	public TarjetaCreditoFacade() {
		super(TarjetaCredito.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
