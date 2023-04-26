package sn.ahiba.gmembrebacken.serviveImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.repositories.MembreRepository;
import sn.ahiba.gmembrebacken.services.ImembreService;

import java.util.List;

@Service
public class MembreServiceImp implements ImembreService {
    @Autowired
    private MembreRepository membreRepository;

    @Override
    public Membre saveMembres(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public Membre updateMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public void deleteMembre(long id) {
        membreRepository.deleteById(id);
    }

    @Override
    public List<Membre> findAllMembres() {
        return membreRepository.findAll();
    }
}


