package sn.ahiba.gmembrebacken.entities;

import jakarta.persistence.*;

@Entity
public class Membre {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long age;
    private String matricule;
    private String prenom;
    private String nom;
    private String sexe;
    private String telephone;
    private String scolarite;
    private String adresse;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="DAHIRACODE", referencedColumnName = "DAHIRACODE", nullable = false)
    private Dahira dahira;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="FONCTIONCODE", referencedColumnName = "FONCTIONCODE", nullable = false)
    private Fonction fonction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="SECTIONCODE", referencedColumnName = "SECTIONCODE", nullable = false)
    private Section section;

    public Membre(Long id, long age, String matricule, String prenom, String nom, String sexe, String telephone, String scolarite, String adresse) {
        this.id = id;
        this.age = age;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.scolarite = scolarite;
        this.adresse = adresse;
    }

    public Membre() {

    }

    public long getId() {
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
