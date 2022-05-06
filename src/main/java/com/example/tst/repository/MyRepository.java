package com.example.tst.repository;

import com.example.tst.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyRepository extends JpaRepository<MyUser, Long> {

    public abstract List<MyUser> findByTitleContainingOrContentContaining(String text, String textAgain);

}
