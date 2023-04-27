package sn.ahiba.gmembrebacken.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Membre;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
    public Optional<Membre> findByMatricule(String matricule);
}
