package by.khodus.service;

import by.khodus.entity.Names;

public interface NamesService {

    Names findById(int id);

    void save(Names names);

    int findIdNames();

}
