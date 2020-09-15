package by.khodus.services;

import by.khodus.entity.Admin;
import by.khodus.entity.Mobile;

import java.util.List;


public interface MobileService {

    void addMobile(Mobile mobile);

    void deleteMobile(int id);

    void editMobile(Mobile mobile);

    List<Mobile> findAll();

    List<Mobile> findModels(String model);

    List<Mobile> sortByModel();

    List<Mobile> sortByCostASC();

    List<Mobile> sortByCostDESC();

    Admin findAdmin();
}
