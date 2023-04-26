package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Fonction;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction,Long> {
}
