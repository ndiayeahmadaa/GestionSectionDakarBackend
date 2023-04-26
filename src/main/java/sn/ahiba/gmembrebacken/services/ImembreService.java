package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;

import java.util.List;

public interface ImembreService {
    public Membre saveMembres(Membre membre);
    public Membre updateMembre(Membre membre);
    public void deleteMembre(long id);
    public List<Membre> findAllMembres();

}
