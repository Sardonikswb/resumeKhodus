package by.khodus.service;

import by.khodus.entity.Contacts;

public interface ContactsService {

    Contacts findById(int id);

    void save(Contacts contacts);

    int findIdContacts();

}
