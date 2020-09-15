package by.khodus.repository;

import by.khodus.entity.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TechnologiesRepository extends JpaRepository<Technologies, Integer>, JpaSpecificationExecutor<Technologies> {

    @Query(value = "select * from technologies where technologies.id_resume= :id_resume", nativeQuery = true)
    List<Technologies> getByIdResume(@Param("id_resume") int id_resume);

    @Modifying
    @Transactional
    @Query(value = "delete from technologies where technologies.id_resume= :id_resume", nativeQuery = true)
    void deleteById_resume(@Param("id_resume") int id_resume);

}
