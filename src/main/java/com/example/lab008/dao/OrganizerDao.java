package com.example.lab008.dao;

import com.example.lab008.entity.Organizer;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.domain.Page;

import java.util.List;


public interface OrganizerDao {
    Integer getOrganizerSize();
    Page<Organizer> getOrganizers (Integer pageSize, Integer page);
    Organizer getOrganizer(Long id);

    Organizer save(Organizer organizer);
}
