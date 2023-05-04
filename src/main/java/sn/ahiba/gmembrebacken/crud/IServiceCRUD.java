package sn.ahiba.gmembrebacken.crud;


import java.util.List;
import java.util.Optional;

public interface IServiceCRUD<T,ID> {

    public Optional<?> save(T t);

    public Optional<?> update(T t);

    public Optional<?> getById(Long id);

    public Optional<?> getByCode(String code);

    public boolean deleteByCode(String code);

    public List<?> findAll();
}