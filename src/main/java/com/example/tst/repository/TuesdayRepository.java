package com.example.tst.repository;

import com.example.tst.model.MyUser;
import com.example.tst.model.Tue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TuesdayRepository extends JpaRepository<Tue, Long> {
    public abstract List<Tue> findByTitleContainingOrContentContaining(String text, String textAgain);

}
