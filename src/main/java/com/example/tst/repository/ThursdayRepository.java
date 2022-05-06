package com.example.tst.repository;

import com.example.tst.model.Thu;
import com.example.tst.model.Tue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThursdayRepository extends JpaRepository<Thu, Long> {
    public abstract List<Thu> findByTitleContainingOrContentContaining(String text, String textAgain);

}
