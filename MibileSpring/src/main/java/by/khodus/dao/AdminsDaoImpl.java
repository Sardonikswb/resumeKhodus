package by.khodus.dao;

import by.khodus.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminsDaoImpl implements AdminsDaoSpring {

    @Autowired
    AdminsRepository repository;

    @Override
    public List<Admin> findAll() {
        List list = repository.findAll();
        return list;
    }
}
