package by.khodus.dao;

import by.khodus.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class MobileDaoImpl implements MobileDaoSpring {

    @Autowired
    private MobileRepository repository;

    public void save(Mobile mobile) {
        repository.saveAndFlush(mobile);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public Optional<Mobile> findById(int id) {
        return repository.findById(id);
    }


    public List<Mobile> findByModel(String modelSerch) {
        List<Mobile> models = repository.findByModel(modelSerch);
        return models;
    }

    public List<Mobile> findAll() {
        List<Mobile> mobiles = repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        return mobiles;
    }

    public List<Mobile> sortByModel(){List<Mobile> mobiles = repository.findAll(Sort.by(Sort.Direction.ASC, "model"));
        return mobiles;};

    public List<Mobile> sortByCostASC(){List<Mobile> mobiles = repository.findAll(Sort.by(Sort.Direction.ASC, "cost"));
        return mobiles;};

    public List <Mobile> sortByCostDESC(){List<Mobile> mobiles = repository.findAll(Sort.by(Sort.Direction.DESC, "cost"));
        return mobiles;};

    public MobileDaoImpl() {
    }
}