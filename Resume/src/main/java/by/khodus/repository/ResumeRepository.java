package by.khodus.repository;

import by.khodus.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer>, JpaSpecificationExecutor<Resume> {

    @Query(value = "select * from resume INNER JOIN names ON resume.names = names.id INNER JOIN contacts ON resume.contacts = contacts.id " +
            "where names.surename like  %:name% or names.name like %:name% or names.middle_name like %:name%", nativeQuery = true)
    List<Resume> searchList(@Param("name") String name);

    @Query(value = "select * from resume where resume.id=:id", nativeQuery = true)
    List<Resume> getById(@Param("id") int id);

}
