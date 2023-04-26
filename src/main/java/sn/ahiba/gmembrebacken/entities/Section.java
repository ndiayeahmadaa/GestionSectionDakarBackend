package sn.ahiba.gmembrebacken.entities;

import jakarta.persistence.*;

@Entity
public class Section {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String adresse;
    private String telephone;
    @ManyToOne
    private Dahira dahira;

    public Section() {
    }

    public Section(long id, String nom, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Dahira getDahira() {
        return dahira;
    }

    public void setDahira(Dahira dahira) {
        this.dahira = dahira;
    }
}
