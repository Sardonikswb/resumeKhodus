package by.khodus.repository;

import by.khodus.entity.Names;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NamesRepository extends JpaRepository<Names, Integer>, JpaSpecificationExecutor<Integer> {

    @Query(value = "SELECT id FROM names ORDER BY id DESC LIMIT 1", nativeQuery = true)
    int findIdNames();

    @Query(value = "select * from names where names.id=:id", nativeQuery = true)
    List<Names> getById(@Param("id") int id);
}
