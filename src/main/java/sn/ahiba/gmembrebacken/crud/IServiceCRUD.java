package sn.ahiba.gmembrebacken.crud;


import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IServiceCRUD<T,ID> {

    public Optional<?> save(T t);
    public Optional<?> update(T t);
    public Optional<?> getById(Long id);
    public ResponseEntity<?> deleteByCode(String code);
    public List<?> findAll();
}
