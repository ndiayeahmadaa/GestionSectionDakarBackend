package sn.ahiba.gmembrebacken.dto;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Section;

public class MembreDTO {

    private Long id;
    private long age;

    private String matricule;
    private String prenom;
    private String nom;
    private String sexe;
    private String telephone;
    private String scolarite;
    private String adresse;

    private Dahira dahira;

    private Fonction fonction;


    private Section section;


    public MembreDTO(Long id, long age, String matricule, String prenom, String nom, String sexe, String telephone, String scolarite, String adresse, Dahira dahira, Fonction fonction, Section section) {
        this.id = id;
        this.age = age;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.scolarite = scolarite;
        this.adresse = adresse;
        this.dahira = dahira;
        this.fonction = fonction;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getScolarite() {
        return scolarite;
    }

    public void setScolarite(String scolarite) {
        this.scolarite = scolarite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Dahira getDahira() {
        return dahira;
    }

    public void setDahira(Dahira dahira) {
        this.dahira = dahira;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
