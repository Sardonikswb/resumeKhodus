package by.khodus.repository;

import by.khodus.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactsRepository extends JpaRepository<Contacts, Integer>, JpaSpecificationExecutor<Contacts> {

    @Query(value = "SELECT id FROM contacts ORDER BY id DESC LIMIT 1", nativeQuery = true)
    int findIdContacts();

    @Query(value = "select * from contacts where contacts.id=:id", nativeQuery = true)
    List<Contacts> getById(@Param("id") int id);
}

