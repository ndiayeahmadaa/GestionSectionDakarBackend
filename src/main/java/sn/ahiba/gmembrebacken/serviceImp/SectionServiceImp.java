package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Section;
import sn.ahiba.gmembrebacken.repositories.SectionRepository;
import sn.ahiba.gmembrebacken.services.ISectionService;

import java.util.List;
import java.util.Optional;

@Service
public class SectionServiceImp implements ISectionService {
    @Autowired
    private SectionRepository sectionRepository;
    @Override
    public Optional<Section> save(Section section) {
        return Optional.of(sectionRepository.save(section));
    }

    @Override
    public Optional<Section> update(Section section) {
        return Optional.of(sectionRepository.save(section));
    }

    @Override
    public void deleteByCode(Long id) {
        sectionRepository.deleteById(id);
    }

    @Override
    public Optional<Section> getById(Long id) {
        return sectionRepository.findById(id);
    }

    @Override
    public Optional<Section> getByNom(String nom) {
        return sectionRepository.findByNom(nom);
    }

    @Override
    public List<Section> fingAll() {
        return sectionRepository.findAll();
    }
}
