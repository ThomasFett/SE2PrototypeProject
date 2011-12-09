package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Bild implements Serializable {

    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    private long id;
    private String url;
    @Temporal (TemporalType.DATE)
    private Date datum;
    private int laenge;
    private int breite;
    private String titel;
    @ManyToOne
    private Beitrag beitrag;

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
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @return the laenge
     */
    public int getLaenge() {
        return laenge;
    }

    /**
     * @param laenge the laenge to set
     */
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    /**
     * @return the breite
     */
    public int getBreite() {
        return breite;
    }

    /**
     * @param breite the breite to set
     */
    public void setBreite(int breite) {
        this.breite = breite;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

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
}