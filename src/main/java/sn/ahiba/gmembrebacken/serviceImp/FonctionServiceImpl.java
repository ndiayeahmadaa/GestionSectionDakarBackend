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
    public Optional<Fonction> getByCode(String nom) {
        return fonctionRepository.findByCode(nom);
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
    public boolean deleteByCode(String code) {
        boolean isDeleted = false;
        Optional<Fonction> fonctionToDelete = fonctionRepository.findByCode(code);

        if (fonctionToDelete.isPresent()) {
            fonctionRepository.delete(fonctionToDelete.get());
            isDeleted = true;
        }

        return isDeleted;
    }

    @Override
    public List<?> findAll() {
        return fonctionRepository.findAll();
    }

    @Override
    public List<Fonction> findByMembreCode(String codeMembre) {
        return null;
    }
}
