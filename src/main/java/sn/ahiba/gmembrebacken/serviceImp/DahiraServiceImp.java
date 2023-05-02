package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.repositories.DahiraRepository;
import sn.ahiba.gmembrebacken.services.IDahiraService;

import java.util.List;
import java.util.Optional;

@Service
public class DahiraServiceImp implements IDahiraService {
    @Autowired
    private DahiraRepository dahiraRepository;

    @Override
    public Optional<?> save(Dahira dahira) {
        return Optional.of(dahiraRepository.save(dahira));
    }

    @Override
    public Optional<?> update(Dahira dahira) {
        return Optional.of(dahiraRepository.save(dahira));
    }

    @Override
    public Optional<?> getById(Long id) {
        return dahiraRepository.findById(id);
    }

    @Override
    public void deleteByCode(long id) {
      dahiraRepository.deleteById(id);
    }

    @Override
    public List<?> findAll() {
        return dahiraRepository.findAll();
    }

    @Override
    public Optional<Dahira> getByCode(String code) {
        return dahiraRepository.findByCode(code);
    }
}
