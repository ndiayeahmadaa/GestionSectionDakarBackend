package sn.ahiba.gmembrebacken.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.entities.Section;
import sn.ahiba.gmembrebacken.repositories.MembreRepository;
import sn.ahiba.gmembrebacken.services.IMembreService;

import java.util.List;
import java.util.Optional;

@Service
public class MembreServiceImp implements IMembreService {
    @Autowired
    private MembreRepository membreRepository;



    @Override
    public Optional<Membre> getByMatricule(String matricule) {
        return membreRepository.findByMatricule(matricule);
    }

    @Override
    public List<Membre> findByDahiraCode(String codeDahira) {
        return membreRepository.findByDahiraCode(codeDahira);
    }

    @Override
    public List<Membre> findByFonctionCode(String  codeFonction) {
        return membreRepository.findByFonctionCode(codeFonction);
    }

    @Override
    public List<Membre> findBySectionCode(String codeSection) {
        return membreRepository.findBySectionCode(codeSection);
    }

    @Override
    public List<Membre> findAll(String codeFonction, String codeSection) {
        if (codeSection != null){
            return membreRepository.findBySectionCode(codeSection);
        } else if (codeFonction != null) {
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
        return  membreRepository.findById(id);
    }


    @Override
    public void deleteByCode(long id) {
     membreRepository.deleteById(id);
    }

    @Override
    public List<?> findAll() {
        return membreRepository.findAll();
    }
}


