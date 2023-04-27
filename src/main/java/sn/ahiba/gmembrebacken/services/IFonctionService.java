package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.entities.Fonction;

import java.util.List;
import java.util.Optional;

public interface IFonctionService {
    public Optional<Fonction> save(Fonction fonction);
    public Optional<Fonction> update(Fonction fonction);
    public Optional<Fonction> getById(Long id);
    public void deleteByCode(long id);
    public List<Fonction> findAll();
    public Optional<Fonction> getByNom(String nom);
}
