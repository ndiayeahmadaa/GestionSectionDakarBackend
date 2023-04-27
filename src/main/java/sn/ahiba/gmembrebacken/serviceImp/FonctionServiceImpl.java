package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.repositories.FonctionRepository;
import sn.ahiba.gmembrebacken.services.IFonctionService;

import java.util.List;
import java.util.Optional;
@Service
public class FonctionServiceImpl implements IFonctionService {
    @Autowired
    private FonctionRepository fonctionRepository;
    @Override
    public Optional<Fonction> save(Fonction fonction) {
        return Optional.of(fonctionRepository.save(fonction));
    }

    @Override
    public Optional<Fonction> update(Fonction fonction) {
        return Optional.of(fonctionRepository.save(fonction));
    }

    @Override
    public Optional<Fonction> getById(Long id) {
        return fonctionRepository.findById(id);
    }

    @Override
    public void deleteByCode(long id) {
         fonctionRepository.deleteById(id);
    }

    @Override
    public List<Fonction> findAll() {
        return fonctionRepository.findAll();
    }

    @Override
    public Optional<Fonction> getByNom(String nom) {
        return fonctionRepository.findByNom(nom);
    }
}
