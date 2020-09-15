package by.khodus.service.impl;

import by.khodus.entity.Technologies;
import by.khodus.repository.TechnologiesRepository;
import by.khodus.service.TechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologiesServiceImpl implements TechnologiesService {

    public TechnologiesServiceImpl() {
    }

    @Autowired
    TechnologiesRepository repository;

    @Override
    public void save(Technologies technologies) {
        repository.saveAndFlush(technologies);
    }

    @Override
    public void delete(int id_resume) {
        repository.deleteById_resume(id_resume);
    }

}
