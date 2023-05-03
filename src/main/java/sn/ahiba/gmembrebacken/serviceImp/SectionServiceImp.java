package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Section;
import sn.ahiba.gmembrebacken.repositories.SectionRepository;
import sn.ahiba.gmembrebacken.services.ISectionService;

import java.util.List;
import java.util.Optional;

@Service
public class SectionServiceImp implements ISectionService  {
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
    public ResponseEntity<?> deleteByCode(String code) {
     return sectionRepository.deleteByCode(code);
    }

    @Override
    public List<?> findAll() {
        return sectionRepository.findAll();
    }
}
