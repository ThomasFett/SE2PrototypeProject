/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Kommentar;

/**
 *
 * @author thomasfett
 */
@Stateless
public class KommentarFacade extends AbstractFacade<Kommentar> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KommentarFacade() {
        super(Kommentar.class);
    }
    
}
