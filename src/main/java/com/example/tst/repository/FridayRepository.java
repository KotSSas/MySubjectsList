package com.example.tst.repository;

import com.example.tst.model.Fri;
import com.example.tst.model.Tue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FridayRepository extends JpaRepository<Fri, Long> {
    public abstract List<Fri> findByTitleContainingOrContentContaining(String text, String textAgain);

}
