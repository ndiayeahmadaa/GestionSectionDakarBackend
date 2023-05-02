package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ahiba.gmembrebacken.entities.Section;

import java.util.List;
import java.util.Optional;

public interface SectionRepository extends JpaRepository<Section,Long> {
    public Optional<Section> findByNom(String nom);
}
