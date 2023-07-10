package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;

import java.util.List;

public interface IFonctionService extends IServiceCRUD<Fonction,Long> {
    public List<Fonction> findByMembreCode(String codeMembre);

}
