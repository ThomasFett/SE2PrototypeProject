package model;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Kommentar extends Beitrag implements Serializable {

    @ManyToOne
    private Beitrag beitrag;
    
    /**
     * @return the beitrag
     */
    public Beitrag getBeitrag() {
        return beitrag;
    }

    /**
     * @param beitrag the beitrag to set
     */
    public void setBeitrag(Beitrag beitrag) {
        this.beitrag = beitrag;
    }
    
}