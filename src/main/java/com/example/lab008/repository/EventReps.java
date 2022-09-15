package com.example.lab008.repository;

import com.example.lab008.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventReps extends JpaRepository<Event, Long> {
    List<Event> findAll();
}
