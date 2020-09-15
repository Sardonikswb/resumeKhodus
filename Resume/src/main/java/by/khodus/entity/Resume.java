package by.khodus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "resume")
public class Resume implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id_resume")
    @SequenceGenerator(name = "gen_id_resume", sequenceName = "resume_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @OneToOne(optional = false)
    @JoinColumn(name = "id", unique = true, nullable = false, updatable = false)
    private Names names;

    @NotNull
    @Column(name = "Names")
    private int idNames;

    @Column(name = "birthday")
    private String birthday;

    @OneToOne(optional = false)
    @JoinColumn(name = "id", unique = true, nullable = false, updatable = false)
    private Contacts contacts;

    @NotNull
    @Column(name = "Contacts")
    private int idContacts;

    @Column(name = "gender")
    private String gender;

    @Column(name = "technology")
    private String technology;

    public Resume() {
    }

    public Resume(int id, Names names, String birthday, Contacts contacts, String gender, String technology) {
        this.id = id;
        this.names = names;
        this.birthday = birthday;
        this.contacts = contacts;
        this.gender = gender;
        this.technology = technology;
    }

    public Resume(Names names, String birthday, Contacts contacts, String gender, String technology) {
        this.names = names;
        this.birthday = birthday;
        this.contacts = contacts;
        this.gender = gender;
        this.technology = technology;
    }

    public Resume(int idNames, String birthday, int idContacts, String gender, String technology) {
        this.idNames = idNames;
        this.names = names;
        this.birthday = birthday;
        this.idContacts = idContacts;
        this.gender = gender;
        this.technology = technology;
    }

    public Resume(int idNames, String birthday, int idContacts, String gender) {
        this.idNames = idNames;
        this.names = names;
        this.birthday = birthday;
        this.idContacts = idContacts;
        this.gender = gender;
    }

    public Resume(int id, int idNames, String birthday, int idContacts, String gender, String technology) {
        this.id = id;
        this.idNames = idNames;
        this.names = names;
        this.birthday = birthday;
        this.idContacts = idContacts;
        this.gender = gender;
        this.technology = technology;
    }

    public Resume(int id, int idNames, String birthday, int idContacts, String gender) {
        this.id = id;
        this.idNames = idNames;
        this.names = names;
        this.birthday = birthday;
        this.idContacts = idContacts;
        this.gender = gender;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public Names getNames() {
        return names;
    }

    public int getIdNames() {
        return idNames;
    }

    public void setIdNames(int idNames) {
        this.idNames = idNames;
    }

    public int getIdContacts() {
        return idContacts;
    }

    public void setIdContacts(int idContacts) {
        this.idContacts = idContacts;
    }
}
