package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Membre;

import java.util.List;

public interface IMembreService extends IServiceCRUD<Membre, Long> {

    public List<Membre> findByDahiraCode(String codeDahira);

    public List<Membre> findByFonctionCode(String codeFonction);

   // public List<Membre> findBySectionCode(String codeSection);

    public List<Membre> findAll(String codeFonction);

}
