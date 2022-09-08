package com.example.lab008.service;

import com.example.lab008.dao.OrganizerDao;
import com.example.lab008.entity.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerServiceImplement implements OrganizerService{

    @Autowired
    OrganizerDao organizerDao;

    @Override
    public Integer getOrganizerSize() {
        return organizerDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerDao.getOrganizers(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerDao.getOrganizer(id);
    }
}
