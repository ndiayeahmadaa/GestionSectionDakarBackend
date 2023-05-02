package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.entities.Section;

import java.util.List;
import java.util.Optional;

public interface IMembreService extends IServiceCRUD<Membre,Long> {


    public Optional<Membre> getByMatricule(String matricule);
    public List<Membre> findByDahiraCode(String codeDahira);
    public List<Membre> findByFonctionCode(String codeFonction);
    public List<Membre> findBySectionCode(String codeSection);

    public  List<Membre> findAll(String codeFonction,String codeSection);



}
