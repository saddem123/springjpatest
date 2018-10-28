package com.example.demo.repristory;

import com.example.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    @Override
    <S extends Users> S save(S s);

    @Override
    List<Users> findAll();
}
