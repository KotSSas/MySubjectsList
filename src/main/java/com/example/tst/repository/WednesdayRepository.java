package com.example.tst.repository;

import com.example.tst.model.Tue;
import com.example.tst.model.Wed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WednesdayRepository extends JpaRepository<Wed, Long> {
    public abstract List<Wed> findByTitleContainingOrContentContaining(String text, String textAgain);

}
