package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.entities.Dahira;

import java.util.List;
import java.util.Optional;

public interface IDahiraService {

    public Optional<Dahira> save(Dahira dahira);
    public Optional<Dahira> update(Dahira dahira);
    public Optional<Dahira> getById(Long id);
    public Optional<Dahira> getByCode(String code);
    public void deleteByCode(long id);
    public List<Dahira> findAll();
}
