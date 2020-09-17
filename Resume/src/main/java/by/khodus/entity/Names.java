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

    public static class Builder {
        private Names newNames;

        public Builder() {
            newNames = new Names();
        }

        public Builder withId(int id) {
            newNames.id = id;
            return this;
        }

        public Builder withSureName(String sureName) {
            newNames.surename = sureName;
            return this;
        }

        public Builder withName(String name) {
            newNames.name = name;
            return this;
        }

        public Builder withMiddleName(String middleName) {
            newNames.middle_name = middleName;
            return this;
        }

        public Builder withResume(Resume resume) {
            newNames.resume = resume;
            return this;
        }

        public Names build() {
            return newNames;
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
