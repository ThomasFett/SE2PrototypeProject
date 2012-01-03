/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author thomasfett
 */
@Entity
public class Mitarbeiterbild implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String url;
    private String name;
    @OneToOne
    private Mitarbeiter myMitarbeiter;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the myMitarbeiter
     */
    public Mitarbeiter getMyMitarbeiter() {
        return myMitarbeiter;
    }

    /**
     * @param myMitarbeiter the myMitarbeiter to set
     */
    public void setMyMitarbeiter(Mitarbeiter myMitarbeiter) {
        this.myMitarbeiter = myMitarbeiter;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "" + this.getName();
    }
    
}
