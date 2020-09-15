package by.khodus.dao;

import by.khodus.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>, JpaSpecificationExecutor<Mobile> {

    @Query(value = "select * from mobile where model like :modelSearch% order by id", nativeQuery = true)
    List<Mobile> findByModel(@Param("modelSearch") String modelSearch);
     }
