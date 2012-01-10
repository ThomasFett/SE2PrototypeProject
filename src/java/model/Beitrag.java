package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Beitrag implements Serializable {

    @Id
    @GeneratedValue (strategy= GenerationType.SEQUENCE)
    private long id;
    @Temporal (TemporalType.DATE)
    private Date datum;
    private int bewertung;
    private String titel;
    private String beschreibung;
    @OneToMany(fetch= FetchType.EAGER, mappedBy = "beitrag",cascade = CascadeType.ALL)
    private Collection<Kommentar> myKommentare;
    @OneToMany
    private Collection<Bild> myBilder;
    @ManyToOne
    private Mitarbeiter autor;
    
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
     * @return the bewertung
     */
    public int getBewertung() {
        return bewertung;
    }

    /**
     * @param bewertung the bewertung to set
     */
    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
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
     * @return the beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * @return the myKommentare
     */
    public Collection<Kommentar> getMyKommentare() {
        return myKommentare;
    }

    /**
     * @param myKommentare the myKommentare to set
     */
    public void setMyKommentare(Collection<Kommentar> myKommentare) {
        this.myKommentare = myKommentare;
    }

    /**
     * @return the myBilder
     */
    public Collection<Bild> getMyBilder() {
        return myBilder;
    }

    /**
     * @param myBilder the myBilder to set
     */
    public void setMyBilder(Collection<Bild> myBilder) {
        this.myBilder = myBilder;
    }

    /**
     * @return the autor
     */
    public Mitarbeiter getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Mitarbeiter autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "<b>schmuuu:</b> "+ getAutor() + getTitel();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Beitrag) {
            Beitrag ob = (Beitrag) obj;
            if (ob.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + (this.datum != null ? this.datum.hashCode() : 0);
        hash = 59 * hash + this.bewertung;
        hash = 59 * hash + (this.titel != null ? this.titel.hashCode() : 0);
        hash = 59 * hash + (this.beschreibung != null ? this.beschreibung.hashCode() : 0);
        hash = 59 * hash + (this.myKommentare != null ? this.myKommentare.hashCode() : 0);
        hash = 59 * hash + (this.myBilder != null ? this.myBilder.hashCode() : 0);
        hash = 59 * hash + (this.autor != null ? this.autor.hashCode() : 0);
        return hash;
    }
}