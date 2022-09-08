package com.example.lab008.dao;

import com.example.lab008.entity.Event;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents (Integer pageSize, Integer page);
    Event getEvent(Long id);
}
