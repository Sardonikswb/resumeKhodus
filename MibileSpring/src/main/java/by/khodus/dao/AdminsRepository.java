package by.khodus.dao;

import by.khodus.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminsRepository extends JpaRepository<Admin, String>, JpaSpecificationExecutor<Admin> {
}
