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
    public Optional<?> getById(Section section) {
        return sectionRepository.findById(section.getId());
    }

    @Override
    public void deleteByCode(long id) {
     sectionRepository.deleteById(id);
    }

    @Override
    public List<?> findAll() {
        return sectionRepository.findAll();
    }
}
