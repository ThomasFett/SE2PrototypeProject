/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Kommentar;

/**
 *
 * @author thomasfett
 */
@Stateless
public class KommentarFacade extends AbstractFacade<Kommentar> {
    @PersistenceContext(unitName = "FingerUebung05PU")
    private EntityManager em;
    private Class<Kommentar> entityClass;

    protected EntityManager getEntityManager() {
        return em;
    }

    public KommentarFacade() {
        super(Kommentar.class);
    }
    
    public List<Kommentar> findById(int id) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Kommentar> query = cb.createQuery(Kommentar.class);
        Root<Kommentar> sm = query.from(Kommentar.class);
        query.where(cb.equal(sm.get("id"), 755));
        System.out.println("saddsadsa");
        return getEntityManager().createQuery(query).getResultList();
    }
    
}
