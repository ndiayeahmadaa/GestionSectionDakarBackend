package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Fonction;

import java.util.Optional;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction,Long> {

    public Optional<Fonction> findByNom(String nom);
    public ResponseEntity<?> deleteByCode(String code);

}
