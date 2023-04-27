package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Fonction;

import java.util.List;
import java.util.Optional;

public interface IFonctionService extends IServiceCRUD<Fonction,Long> {

    public Optional<Fonction> getByNom(String nom);
}
