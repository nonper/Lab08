package com.example.lab008.dao;

import com.example.lab008.entity.Organizer;

import java.util.List;


public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers (Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);
}
