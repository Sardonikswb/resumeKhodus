package by.khodus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "names")
public class Names implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id_names")
    @SequenceGenerator(name = "gen_id_names", sequenceName = "names_id_seq", allocationSize = 1)
    private int id;

    @NotNull
    @Column(name = "surename")
    private String surename;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "middle_name")
    private String middle_name;

    @OneToOne(optional = false, mappedBy = "names")
    public Resume resume;

    public Names(int id, String name, String surename, String middle_name) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.middle_name = middle_name;
    }

    public Names(String name, String surename, String middle_name) {
        this.name = name;
        this.surename = surename;
        this.middle_name = middle_name;
    }

    public Names() {
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

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    @Override
    public String toString() {
        return surename + " " + name + " " + middle_name;
    }
}
