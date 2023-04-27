package sn.ahiba.gmembrebacken.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.entities.Section;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
    public Optional<Membre> findByMatricule(String matricule);
    public List<Membre> findByFonction(Fonction fonction);
    public List<Membre> findByDahira(Dahira dahira);
    public List<Membre> findBySection(Section section);
}
