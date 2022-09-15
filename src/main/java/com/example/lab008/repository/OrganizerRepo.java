package com.example.lab008.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.lab008.entity.Organizer;
import java.util.List;

public interface OrganizerRepo extends JpaRepository<Organizer, Long> {
    List<Organizer> findAll();
}
