/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Mitarbeiter;

/**
 *
 * @author thomasfett
 */
@Stateless
public class MitarbeiterFacade extends AbstractFacade<Mitarbeiter> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MitarbeiterFacade() {
        super(Mitarbeiter.class);
    }
    
}
