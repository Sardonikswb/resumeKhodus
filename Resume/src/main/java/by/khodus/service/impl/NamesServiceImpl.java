package by.khodus.service.impl;

import by.khodus.entity.Names;
import by.khodus.repository.NamesRepository;
import by.khodus.service.NamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NamesServiceImpl implements NamesService {

    @Autowired
    NamesRepository repository;

    @Override
    public void save(Names names) {
        repository.saveAndFlush(names);
    }

    @Override
    public int findIdNames() {
        return repository.findIdNames();
    }

    @Override
    public Names findById(int id) {
        return repository.getById(id).get(0);
    }

}
