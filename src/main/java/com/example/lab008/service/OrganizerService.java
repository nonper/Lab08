package com.example.lab008.service;

import com.example.lab008.entity.Organizer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrganizerService {
    Integer getOrganizerSize();
    Page<Organizer> getOrganizers(Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);

    Organizer save(Organizer organizer);
}
