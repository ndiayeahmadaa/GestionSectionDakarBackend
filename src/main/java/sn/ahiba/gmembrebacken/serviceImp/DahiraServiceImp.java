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
    public Optional<Dahira> save(Dahira dahira) {
        return Optional.of(dahiraRepository.save(dahira));
    }

    @Override
    public Optional<Dahira> update(Dahira dahira) {
        return Optional.of(dahiraRepository.save(dahira));
    }

    @Override
    public Optional<Dahira> getById(Long id) {
        return dahiraRepository.findById(id);
    }

    @Override
    public Optional<Dahira> getByCode(String code) {
        return dahiraRepository.findByCode(code);
    }

    @Override
    public void deleteByCode(long id) {
        dahiraRepository.deleteById(id);
    }


    @Override
    public List<Dahira> findAll() {
        return dahiraRepository.findAll();
    }
}
