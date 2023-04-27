package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.entities.Section;

import java.util.List;
import java.util.Optional;

public interface ISectionService {
    public Optional<Section> save(Section section);
    public Optional<Section> update(Section section);
    public void deleteByCode(Long id);
    public Optional<Section> getById(Long id);
    public Optional<Section> getByNom(String nom);
    public List<Section> fingAll();

}
