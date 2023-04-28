package sn.ahiba.gmembrebacken.entities;

import jakarta.persistence.*;

@Entity
public class Fonction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String nom;
    @Column(name = "FONCTIONCODE", nullable = false, unique = true)
    private String code;
    public Fonction(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Fonction() {

    }

    public long getId() {
        return id;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
