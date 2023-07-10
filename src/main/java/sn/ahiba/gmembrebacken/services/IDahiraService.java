package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Membre;

import java.util.List;

public interface IDahiraService extends IServiceCRUD<Dahira,Long>{
    public List<Dahira> findBySectionCode(String codeSection);

    List<Dahira> findAll(String codeSection);
}




