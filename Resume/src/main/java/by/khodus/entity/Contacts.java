package by.khodus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "contacts")
public class Contacts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id_contacts")
    @SequenceGenerator(name = "gen_id_contacts", sequenceName = "contacts_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @NotNull
    @Column(name = "phone")
    private String phone;

    @Column(name = "github")
    private String github;

    @Column(name = "email")
    private String email;

    @Column(name = "skype")
    private String skype;

    @Column(name = "linkedin")
    private String linkedin;

    @OneToOne(optional = false, mappedBy = "contacts")
    public Resume resume;

    public static class Builder {
        private Contacts newContacts;

        public Builder() {
            newContacts = new Contacts();
        }

        public Builder withId(int id) {
            newContacts.id = id;
            return this;
        }

        public Builder withPhone(String phone) {
            newContacts.phone = phone;
            return this;
        }

        public Builder withGithub(String github) {
            newContacts.github = github;
            return this;
        }

        public Builder withEmail(String email) {
            newContacts.email = email;
            return this;
        }

        public Builder withSkype(String skype) {
            newContacts.skype = skype;
            return this;
        }

        public Builder withLinkedin(String linkedin) {
            newContacts.linkedin = linkedin;
            return this;
        }

        public Builder withResume(Resume resume) {
            newContacts.resume = resume;
            return this;
        }

        public Contacts build() {
            return newContacts;
        }
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return phone + " " + github + " " + email + " " + skype + " " + linkedin;
    }
}
