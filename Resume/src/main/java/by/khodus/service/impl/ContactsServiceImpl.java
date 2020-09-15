package by.khodus.service.impl;

import by.khodus.entity.Contacts;
import by.khodus.repository.ContactsRepository;
import by.khodus.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    ContactsRepository repository;

    @Override
    public void save(Contacts contacts) {
        repository.saveAndFlush(contacts);
    }

    @Override
    public int findIdContacts() {
        return repository.findIdContacts();
    }

    @Override
    public Contacts findById(int id) {
        return repository.getById(id).get(0);
    }
}
