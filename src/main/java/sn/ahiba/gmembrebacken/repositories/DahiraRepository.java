package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Dahira;

import java.util.Optional;

@Repository
public interface DahiraRepository extends JpaRepository<Dahira, Long> {

    public Optional<Dahira> findByCode(String code);

    public Optional<Dahira> findBySectionCode(String codeSection);

    public ResponseEntity<?> deleteByCode(String code);

}
