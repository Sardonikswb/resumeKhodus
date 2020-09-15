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

    public Contacts(int id, String phone, String github, String email, String linkedin, String skype) {
        this.id = id;
        this.phone = phone;
        this.github = github;
        this.email = email;
        this.linkedin = linkedin;
        this.skype = skype;
    }

    public Contacts(String phone, String github, String email, String linkedin, String skype) {
        this.phone = phone;
        this.github = github;
        this.email = email;
        this.linkedin = linkedin;
        this.skype = skype;
    }

    public Contacts() {
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
