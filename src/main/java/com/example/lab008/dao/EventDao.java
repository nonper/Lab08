package com.example.lab008.dao;

import com.example.lab008.entity.Event;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents (Integer pageSize, Integer page);
    Event getEvent(Long id);

    Event save(Event event);
}
