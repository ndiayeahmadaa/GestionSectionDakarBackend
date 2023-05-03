package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public Optional<Fonction> getByNom(String nom) {
        return fonctionRepository.findByNom(nom);
    }

    @Override
    public Optional<?> save(Fonction fonction) {
        return Optional.of(fonctionRepository.save(fonction));
    }

    @Override
    public Optional<?> update(Fonction fonction) {
        return Optional.of(fonctionRepository.save(fonction));
    }

    @Override
    public Optional<?> getById(Long id) {
        return fonctionRepository.findById(id);
    }

    @Override
    public ResponseEntity<?> deleteByCode(String code) {
        return fonctionRepository.deleteByCode(code);
    }



    @Override
    public List<?> findAll() {
        return fonctionRepository.findAll();
    }
}
