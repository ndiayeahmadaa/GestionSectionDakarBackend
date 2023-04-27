package sn.ahiba.gmembrebacken.serviveImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.repositories.MembreRepository;
import sn.ahiba.gmembrebacken.services.IMembreService;

import java.util.List;
import java.util.Optional;

@Service
public class MembreServiceImp implements IMembreService {
    @Autowired
    private MembreRepository membreRepository;

    @Override
    public Optional<Membre> save(Membre membre) {
        return Optional.of(membreRepository.save(membre));
    }

    @Override
    public Optional<Membre> update(Membre membre) {
        return  Optional.of(membreRepository.save(membre));
    }

    @Override
    public Optional<Membre> getById(long id) {
        return membreRepository.findById(id);
    }

    @Override
    public Optional<Membre> getByMatricule(String matricule) {
        return membreRepository.findByMatricule(matricule);
    }

    @Override
    public void deleteByCode(long id) {
        membreRepository.deleteById(id);
    }

    @Override
    public List<Membre> findAll() {
        return membreRepository.findAll();
    }
}


