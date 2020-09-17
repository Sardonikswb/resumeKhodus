package by.khodus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "technologies")
public class Technologies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_id_tech")
    @SequenceGenerator(name = "gen_id_tech", sequenceName = "technologies_id_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @NotNull
    @Column(name = "technology")
    private String technology;

    @Column(name = "id_resume")
    private int id_resume;

    public static class Builder {
        private Technologies newTechnologies;

        public Builder() {
            newTechnologies = new Technologies();
        }

        public Builder withId(int id) {
            newTechnologies.id = id;
            return this;
        }

        public Builder withTechnologies(String technologies) {
            newTechnologies.technology = technologies;
            return this;
        }

        public Builder withIdResume(int idResume) {
            newTechnologies.id_resume = idResume;
            return this;
        }

        public Technologies build() {
            return newTechnologies;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getId_resume() {
        return id_resume;
    }

    public void setId_resume(int id_resume) {
        this.id_resume = id_resume;
    }

    @Override
    public String toString() {
        return technology;
    }
}
