package by.khodus.service;

import by.khodus.entity.Contacts;
import by.khodus.entity.Names;
import by.khodus.entity.Resume;
import by.khodus.repository.ContactsRepository;
import by.khodus.repository.NamesRepository;
import by.khodus.repository.ResumeRepository;
import by.khodus.repository.TechnologiesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ServiceTest {

    @Autowired
    ResumeRepository repository;

    @Autowired
    NamesRepository namesRepository;

    @Autowired
    ContactsRepository contactsRepository;

    @Autowired
    TechnologiesRepository technologiesRepository;

    @Test
    public void checkAddTest() {
        Names namesTest = new Names.Builder().withName("name").withSureName("surename").withMiddleName("middle_name").build();
        Contacts contactsTest = new Contacts.Builder().withPhone("phone").withGithub("github").withEmail("email").withLinkedin("linkedin").withSkype("skype").build();
        namesRepository.saveAndFlush(namesTest);
        contactsRepository.saveAndFlush(contactsTest);
        int id = namesRepository.findIdNames();
        Resume resumeTest = new Resume.Builder().withIdNames(id).withBirthday("birthday").withIdContacts(id).withGender("gender").withTechnology("technology").build();
        repository.saveAndFlush(resumeTest);

        List<Names> namesList = namesRepository.findAll();
        List<Contacts> contactsList = contactsRepository.findAll();
        List<Resume> resumeList = repository.findAll();

        assert (resumeList.contains(resumeTest) && namesList.contains(namesTest) && contactsList.contains(contactsTest));
    }

    @Test
    public void checkEditTest() {
        Names newNames = new Names.Builder().withName("name").withSureName("surename").withMiddleName("middle_name").build();
        Contacts newContacts = new Contacts.Builder().withPhone("phone").withGithub("github").withEmail("email").withLinkedin("linkedin").withSkype("skype").build();
        contactsRepository.saveAndFlush(newContacts);
        namesRepository.saveAndFlush(newNames);
        int id = namesRepository.findIdNames();
        Resume newResume = new Resume.Builder().withId(id).withIdNames(id).withBirthday("birthday").withIdContacts(id).withGender("female").withTechnology("technology").build();
        repository.saveAndFlush(newResume);

        String name = "test";
        String email = "test";
        String gender = "test";

        namesRepository.saveAndFlush(new Names.Builder().withId(id).withName(name).withSureName("surename").withMiddleName("middle_name").build());
        contactsRepository.saveAndFlush(new Contacts.Builder().withId(id).withPhone("phone").withGithub("github").withEmail(email).withLinkedin("linkedin").withSkype("skype").build());
        repository.saveAndFlush(new Resume.Builder().withId(id).withIdNames(id).withBirthday("birthday").withIdContacts(id).withGender(gender).withTechnology("technology").build());

        String nameTest = namesRepository.getById(id).get(0).getName();
        String emailTest = contactsRepository.getById(id).get(0).getEmail();
        String genderTest = repository.getById(id).get(0).getGender();
        assert (genderTest.equals("test") && nameTest.equals("test") && emailTest.equals("test"));
    }

    @Test
    public void checkDeleteTest() {
        Names namesTest = new Names.Builder().withName("name").withSureName("surename").withMiddleName("middle_name").build();
        Contacts contactsTest = new Contacts.Builder().withPhone("phone").withGithub("github").withEmail("email").withLinkedin("linkedin").withSkype("skype").build();
        namesRepository.saveAndFlush(namesTest);
        contactsRepository.saveAndFlush(contactsTest);
        int id = namesRepository.findIdNames();
        Resume resumeTest = new Resume.Builder().withIdNames(id).withBirthday("birthday").withIdContacts(id).withGender("gender").withTechnology("technology").build();
        repository.saveAndFlush(resumeTest);

        repository.delete(resumeTest);
        namesRepository.delete(namesTest);
        contactsRepository.delete(contactsTest);

        List<Names> namesList = namesRepository.findAll();
        List<Contacts> contactsList = contactsRepository.findAll();
        List<Resume> resumeList = repository.findAll();

        assert (!resumeList.contains(resumeTest) && !namesList.contains(namesTest) && !contactsList.contains(contactsTest));
    }

}
