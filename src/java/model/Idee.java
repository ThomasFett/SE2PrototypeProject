package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Idee extends Beitrag implements Serializable {

    @OneToMany
    private Collection<Anhang> myAnhaenge;

    /**
     * @return the myAnhaenge
     */
    public Collection<Anhang> getMyAnhaenge() {
        return myAnhaenge;
    }

    /**
     * @param myAnhaenge the myAnhaenge to set
     */
    public void setMyAnhaenge(Collection<Anhang> myAnhaenge) {
        this.myAnhaenge = myAnhaenge;
    }
}