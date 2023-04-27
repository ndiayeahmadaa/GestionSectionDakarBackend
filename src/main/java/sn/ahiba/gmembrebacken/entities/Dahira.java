package sn.ahiba.gmembrebacken.entities;

import jakarta.persistence.*;

@Entity
public class Dahira {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private String nom;
    private String adresse;
    private String telephone;
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name="SECTIONCODE", referencedColumnName = "SECTIONCODE", nullable = false)
    private Section section;

    public Dahira() {
    }

    public Dahira(long id, String nom, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public long getId() {
        return id;
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

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }


}
