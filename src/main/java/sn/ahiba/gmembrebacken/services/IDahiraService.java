package sn.ahiba.gmembrebacken.services;

import sn.ahiba.gmembrebacken.crud.IServiceCRUD;
import sn.ahiba.gmembrebacken.entities.Dahira;

import java.util.List;
import java.util.Optional;

public interface IDahiraService extends IServiceCRUD<Dahira,Long>{
    public Optional<Dahira> getByCode(String code);
}




