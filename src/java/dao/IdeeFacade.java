/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Idee;

/**
 *
 * @author thomasfett
 */
@Stateless
public class IdeeFacade extends AbstractFacade<Idee> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public IdeeFacade() {
        super(Idee.class);
    }
    
}
