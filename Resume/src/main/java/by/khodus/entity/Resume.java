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

    public static class Builder {
        private Resume newResume;

        public Builder() {
            newResume = new Resume();
        }

        public Builder withId(int id) {
            newResume.id = id;
            return this;
        }

        public Builder withNames(Names names) {
            newResume.names = names;
            return this;
        }

        public Builder withIdNames(int idNames) {
            newResume.idNames = idNames;
            return this;
        }

        public Builder withBirthday(String birthday) {
            newResume.birthday = birthday;
            return this;
        }

        public Builder withContacts(Contacts contacts) {
            newResume.contacts = contacts;
            return this;
        }

        public Builder withIdContacts(int idContacts) {
            newResume.idContacts = idContacts;
            return this;
        }

        public Builder withGender(String gender) {
            newResume.gender = gender;
            return this;
        }

        public Builder withTechnology(String technology) {
            newResume.technology = technology;
            return this;
        }

        public Resume build() {
            return newResume;
        }
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
