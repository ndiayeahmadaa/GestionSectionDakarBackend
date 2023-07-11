package sn.ahiba.gmembrebacken.serviceImp;

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
    public List<Membre> findByDahiraCode(String codeDahira) {
        return membreRepository.findByDahiraCode(codeDahira);
    }



    //@Override
    //public List<Membre> findBySectionCode(String codeSection) {
    //    return membreRepository.findBySectionCode(codeSection);
    //}

    @Override
    public List<Membre> findAll(String codeDahira, String codeFonction) {
         if (codeDahira != null) {
            return membreRepository.findByDahiraCode(codeDahira);
        }
        else if (codeFonction != null) {
            return membreRepository.findByFonctionCode(codeFonction);
        }
         else {
            return membreRepository.findAll();
        }
    }


    @Override
    public Optional<?> save(Membre membre) {
        return Optional.of(membreRepository.save(membre));
    }

    @Override
    public Optional<?> update(Membre membre) {
        return Optional.of(membreRepository.save(membre));
    }

    @Override
    public Optional<?> getById(Long id) {
        return membreRepository.findById(id);
    }

    @Override
    public Optional<Membre> getByCode(String matricule) {
        return membreRepository.findByMatricule(matricule);
    }

    @Override
    public boolean deleteByCode(String code) {
        boolean isDeleted = false;
        Optional<Membre> membreToDelete = membreRepository.findByMatricule(code);

        if (membreToDelete.isPresent()) {
            membreRepository.delete(membreToDelete.get());
            isDeleted = true;
        }

        return isDeleted;
    }

    @Override
    public List<?> findAll() {
        return null;
    }


}
