/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Anhang;

/**
 *
 * @author thomasfett
 */
@Stateless
public class AnhangFacade extends AbstractFacade<Anhang> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public AnhangFacade() {
        super(Anhang.class);
    }
    
}
