package com.example.lab008.dao;


import com.example.lab008.entity.Organizer;
import com.example.lab008.repository.OrganizerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import com.example.lab008.entity.Event;

@Repository
@Profile("db")
public class OrgenizerDaoDBLmp implements OrganizerDao{
    @Autowired
    OrganizerRepo organizerRepo;
    @Override
    public Integer getOrganizerSize() {
        return Math.toIntExact(organizerRepo.count());
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerRepo.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerRepo.findById(id).orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepo.save(organizer);
    }


}
