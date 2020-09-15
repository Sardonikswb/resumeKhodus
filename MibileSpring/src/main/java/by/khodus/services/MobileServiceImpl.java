package by.khodus.services;

import by.khodus.dao.AdminsDaoSpring;
import by.khodus.dao.MobileDaoSpring;
import by.khodus.entity.Admin;
import by.khodus.entity.Mobile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    MobileDaoSpring mobileDao;

    @Autowired
    AdminsDaoSpring adminsDao;

    public MobileServiceImpl() {
    }

    public void addMobile(Mobile mobile) {
        mobileDao.save(mobile);
    }

    public void deleteMobile(int id) {
        mobileDao.delete(id);
    }

    public void editMobile(Mobile mobile) {
        mobileDao.save(mobile);
    }

    public List<Mobile> findAll() {
        return mobileDao.findAll();
    }

    public List<Mobile> findModels(String model) {
        return mobileDao.findByModel(model);
    }

    public List<Mobile> sortByModel() {
        return mobileDao.sortByModel();
    }

    public List<Mobile> sortByCostASC() {
        return mobileDao.sortByCostASC();
    }

    public List<Mobile> sortByCostDESC() {
        return mobileDao.sortByCostDESC();
    }

    @Override
    public Admin findAdmin() {
        return adminsDao.findAll().get(0);
    }


}
