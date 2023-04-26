package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Dahira;

@Repository
public interface DahiraRepository extends JpaRepository<Dahira,Long> {
}
