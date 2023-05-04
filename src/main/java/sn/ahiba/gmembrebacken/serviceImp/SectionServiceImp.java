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
    public Optional<?> save(Section section) {
        return Optional.of(sectionRepository.save(section));
    }

    @Override
    public Optional<?> update(Section section) {
        return Optional.of(sectionRepository.save(section));
    }

    @Override
    public Optional<?> getById(Long id) {
        return sectionRepository.findById(id);
    }

    @Override
    public Optional<Section> getByCode(String matricule) {
        return sectionRepository.findByCode(matricule);
    }

    @Override
    public boolean deleteByCode(String code) {
        boolean isDeleted = false;
        Optional<Section> sectionToDelete = sectionRepository.findByCode(code);

        if (sectionToDelete.isPresent()) {
            sectionRepository.delete(sectionToDelete.get());
            isDeleted = true;
        }

        return isDeleted;
    }

    @Override
    public List<?> findAll() {
        return sectionRepository.findAll();
    }
}
