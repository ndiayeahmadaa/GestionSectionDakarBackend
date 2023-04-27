package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.entities.Section;

import java.util.List;
import java.util.Optional;

public interface IMembreService {
    public Optional<Membre> save(Membre membre);

    public Optional<Membre> update(Membre membre);

    public Optional<Membre> getById(long id);

    public Optional<Membre> getByMatricule(String matricule);

    public void deleteByCode(long id);

    public List<Membre> findAll();

    public List<Membre> findByDahira(Dahira dahira);
    public List<Membre> findByFonction(Fonction fonction);
    public List<Membre> findBySection(Section section);



}
