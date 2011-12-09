/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Beitrag;

/**
 *
 * @author thomasfett
 */
@Stateless
public class BeitragFacade extends AbstractFacade<Beitrag> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public BeitragFacade() {
        super(Beitrag.class);
    }
    
}
